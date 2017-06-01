package org.cae.monitor.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.cae.monitor.security.ShakeHand;
import org.springframework.web.servlet.ModelAndView;

public interface IAdminController {

	void adminLoginView(HttpServletRequest request, HttpServletResponse response);
	
	Map<String,Object> shakeHand(HttpSession session,ShakeHand shakeHand);
	
	ModelAndView removeKeyController(HttpSession session);
}
