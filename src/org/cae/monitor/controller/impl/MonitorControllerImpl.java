package org.cae.monitor.controller.impl;

import java.util.List;
import java.util.Map;

import org.cae.monitor.common.ServerInfo;
import org.cae.monitor.controller.IMonitorController;
import org.cae.monitor.service.IMonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MonitorControllerImpl implements IMonitorController {

	@Autowired
	private IMonitorService monitorService;
	
	@Override
	public ModelAndView queryForHomepageController() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ServerInfo> heartbeatController() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> queryCpuController() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> queryMemoryController() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> queryProcessController() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> queryJvmMemoryController() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> queryJvmThreadController() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> queryJvmClassController() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String exchangeController(ServerInfo serverInfo) {
		// TODO Auto-generated method stub
		return null;
	}

}
