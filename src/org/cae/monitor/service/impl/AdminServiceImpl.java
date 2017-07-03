package org.cae.monitor.service.impl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.Resource;

import org.cae.monitor.common.DaoResult;
import org.cae.monitor.common.ServiceResult;

import static org.cae.monitor.common.Util.toObject;
import org.cae.monitor.dao.IAdminDao;
import org.cae.monitor.entity.Admin;
import org.cae.monitor.security.Desede;
import org.cae.monitor.security.SecurityAlgorithm;
import org.cae.monitor.security.ShakeHand;
import org.cae.monitor.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import static org.cae.monitor.common.Util.*;
@Service("adminService")
public class AdminServiceImpl implements IAdminService {
	private ConcurrentHashMap<Integer, SecurityAlgorithm> keys=new ConcurrentHashMap<Integer, SecurityAlgorithm>();
	@Autowired
	private IAdminDao adminDao;
	@Resource(name="rsa")
	private SecurityAlgorithm rsa;

	/**
	 * 登录过程握手协议的具体业务逻辑方法
	 */
	@Override
	public ServiceResult loginService(ShakeHand shakeHand) {
			ServiceResult theResult = null;
			if(shakeHand.getExtra().equals(md5(shakeHand.getMessage()))){
				//先把客户端传来的json字符串转换为java的map
				Map<String,Object> map=toObject(shakeHand.getMessage(), Map.class);
				//获取经过加密的对称秘钥并使用rsa的秘钥解密,得到真实的对称秘钥
				String key=rsa.decrypt((String)map.get("k"));
				//实例化一个3DES算法的实例,并把对称秘钥通过构造函数注入进去
				SecurityAlgorithm desede=new Desede(key);
				//使用3des对账号进行解密,得到真实的账号
				String userAccount=desede.decrypt((String)map.get("u"));
				//使用3des对密码进行解密,得到真实的密码
				String password=desede.decrypt((String)map.get("p"));
				//调用dao层方法,判断是否登录成功
				DaoResult daoResult=adminDao.getAdminInfoDao(new Admin(userAccount, password));
				//如果登录成功,则把上面已经实例化出来的3des对象放入keys中,这样之后的通信都可以根据管理员id来获取对称秘钥了
				if(daoResult.isSuccessed()){
					Admin admin=(Admin) daoResult.getResult();
					keys.put(admin.getAdminId(), desede);
				}
				theResult=new ServiceResult(daoResult);
				return theResult;
			}else{
			theResult=new ServiceResult(new DaoResult(false, "数据校验失败"));
			return theResult;
			}
	}
	
	@Override
	public String getPublicKeyService() {
		return rsa.getPublicKey();
	}

	@Override
	public void removeKeyService(Integer userId) {
		// TODO Auto-generated method stub
		
	}
}
