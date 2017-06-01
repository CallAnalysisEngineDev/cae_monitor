package org.cae.monitor.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.cae.monitor.common.ServerInfo;
import org.cae.monitor.common.ServiceResult;
import org.cae.monitor.entity.CpuInfo;
import org.cae.monitor.entity.JVMClassLoad;
import org.cae.monitor.entity.JVMMemory;
import org.cae.monitor.entity.JVMThread;
import org.cae.monitor.entity.MemoryInfo;
import org.cae.monitor.entity.ProcessInfo;
import org.cae.monitor.remote.IMonitorController;
import org.cae.monitor.service.IMonitorService;
import org.springframework.stereotype.Service;

@Service("monitorService")
public class MonitorServiceImpl implements IMonitorService {

	private static IMonitorController currentServer;
	private static List<IMonitorController> servers;
	private static List<CpuInfo> cpuInfo = new ArrayList<CpuInfo>();
	private static List<MemoryInfo> memoryInfo = new ArrayList<MemoryInfo>();
	private static List<ProcessInfo> processInfo = new ArrayList<ProcessInfo>();
	private static List<JVMMemory> jvmMemoryInfo = new ArrayList<JVMMemory>();
	private static List<JVMThread> jvmThreadInfo = new ArrayList<JVMThread>();
	private static List<JVMClassLoad> jvmClassLoad = new ArrayList<JVMClassLoad>();
	
	@Override
	public ServiceResult queryForHomepageService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServiceResult heartbeatService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServiceResult queryCpuService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServiceResult queryMemoryService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServiceResult queryProcessService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServiceResult queryJvmMemoryService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServiceResult queryJvmThreadService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServiceResult queryJvmClassService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServiceResult exchangeService(ServerInfo serverInfo) {
		// TODO Auto-generated method stub
		return null;
	}

}
