package org.cae.monitor.service;

import org.cae.monitor.common.ServiceResult;
import org.cae.monitor.security.ShakeHand;

public interface IAdminService {

	ServiceResult loginService(ShakeHand shakeHand);

	String getPublicKeyService();

	void removeKeyService(Integer userId);
}
