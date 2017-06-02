package org.cae.monitor.controller.impl;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.cae.monitor.common.ServiceResult;
import org.cae.monitor.controller.IAdminController;
import org.cae.monitor.entity.Admin;
import org.cae.monitor.security.SecurityAlgorithm;
import org.cae.monitor.security.ShakeHand;
import org.cae.monitor.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminControllerImpl implements IAdminController {

	@Autowired
	private IAdminService adminService;
	
	/**
	 * 管理员登录过程的服务器端握手方法
	 */
	@Override
	@RequestMapping("/shakeHand")
	@ResponseBody
	public Map<String, Object> shakeHand(HttpSession session,ShakeHand shakeHand) {
		Map<String,Object> theResult=new HashMap<String,Object>();
		//因为握手分多个阶段,每个阶段附带的信息内容、含义以及处理逻辑都不同,所以需要根据类型(即ShakeHand的type)来进行不同的处理
		Integer type=shakeHand.getType();
		if(type==SecurityAlgorithm.ASK_PUBKEY){
			//获取服务器自己的公钥并返回
			theResult.put("publicKey", adminService.getPublicKeyService());
		}
		else if(type==SecurityAlgorithm.ENCTYPT_DATA){
			//这个分支就代表客户端已经把账号、密码和对称秘钥都发过来了
			ServiceResult serviceResult=adminService.loginService(shakeHand);
			//如果登录成功,则把管理员的id存入session中
			if(serviceResult.isSuccessed()){
				Admin admin=(Admin) serviceResult.getResult();
				session.setAttribute("adminId", admin.getAdminId());
			}
			theResult=serviceResult.toMap();
		}
		return theResult;
	}

	@Override
	public ModelAndView removeKeyController(HttpSession session) {
		// TODO Auto-generated method stub
		return null;
	}

}
