package org.cae.monitor.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.cae.monitor.common.ServerInfo;
import org.springframework.web.servlet.ModelAndView;

public interface IMonitorController {

	ModelAndView queryForHomepageController(HttpSession session);

	Map<String, Object> heartbeatController(HttpSession session);

	Map<String, Object> queryCpuController(HttpSession session);

	Map<String, Object> queryMemoryController(HttpSession session);

	Map<String, Object> queryProcessController(HttpSession session);

	Map<String, Object> queryJvmMemoryController(HttpSession session);

	Map<String, Object> queryJvmThreadController(HttpSession session);

	Map<String, Object> queryJvmClassController(HttpSession session);

	Map<String, Object> gcController(HttpSession session);

	String exchangeController(HttpSession session, ServerInfo serverInfo);
}
