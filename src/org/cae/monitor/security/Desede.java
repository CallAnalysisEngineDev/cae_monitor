package org.cae.monitor.security;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;

import org.cae.monitor.common.Util;

public class Desede extends AbstractAlgorithm {
	
	private String key;
	//加解密向量,不要改
	private final static String iv = "12345678";
	
	public Desede(String key){
		this.key=key;
	}
	
	@Override
	public String encrypt(String info) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String decrypt(String encryptInfo) {
		try {
			Key deskey = null;
			DESedeKeySpec spec = new DESedeKeySpec(key.getBytes());
			SecretKeyFactory keyfactory = SecretKeyFactory.getInstance("desede");
			deskey = keyfactory.generateSecret(spec);
			//为了和前端js对应,这里的算法模式一定要选desede/CBC/NoPadding
			Cipher cipher = Cipher.getInstance("desede/CBC/NoPadding");
			IvParameterSpec ips = new IvParameterSpec(iv.getBytes());
		    cipher.init(Cipher.DECRYPT_MODE, deskey,ips);
		    byte[] decryptData = cipher.doFinal(Util.base642byte(encryptInfo));
		    return new String(decryptData, "UTF-8").trim();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
