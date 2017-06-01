package org.cae.monitor.controller;

import java.util.List;
import java.util.Map;

import org.cae.monitor.common.ServerInfo;
import org.springframework.web.servlet.ModelAndView;

public interface IMonitorController {

	ModelAndView queryForHomepageController();
	
	List<ServerInfo> heartbeatController();
	
	Map<String,Object> queryCpuController();
	
	Map<String,Object> queryMemoryController();
	
	Map<String,Object> queryProcessController();
	
	Map<String,Object> queryJvmMemoryController();
	
	Map<String,Object> queryJvmThreadController();
	
	Map<String,Object> queryJvmClassController();
	
	String exchangeController(ServerInfo serverInfo);
}
