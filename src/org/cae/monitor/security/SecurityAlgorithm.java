package org.cae.monitor.security;

public interface SecurityAlgorithm {

	final static Integer ASK_PUBKEY = 1;

	final static Integer ENCTYPT_DATA = 2;

	String encrypt(String info);

	String decrypt(String encryptInfo);

	String getPublicKey();

	void setKey(String key);
}
