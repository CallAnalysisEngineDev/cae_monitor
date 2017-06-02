package org.cae.monitor.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.cae.monitor.security.ShakeHand;
import org.springframework.web.servlet.ModelAndView;

public interface IAdminController {
	
	Map<String,Object> shakeHand(HttpSession session,ShakeHand shakeHand);
	
	ModelAndView removeKeyController(HttpSession session);
}
