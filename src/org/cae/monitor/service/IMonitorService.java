package org.cae.monitor.service;

import org.cae.monitor.common.ServerInfo;
import org.cae.monitor.common.ServiceResult;

public interface IMonitorService {

	ServiceResult queryForHomepageService();
	
	ServiceResult heartbeatService();
	
	ServiceResult queryCpuService();
	
	ServiceResult queryMemoryService();
	
	ServiceResult queryProcessService();
	
	ServiceResult queryJvmMemoryService();
	
	ServiceResult queryJvmThreadService();
	
	ServiceResult queryJvmClassService();
	
	ServiceResult exchangeService(ServerInfo serverInfo);
}
