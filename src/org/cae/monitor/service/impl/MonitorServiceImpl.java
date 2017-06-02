package org.cae.monitor.service.impl;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.cae.monitor.common.IConstant;
import org.cae.monitor.common.ServerInfo;
import org.cae.monitor.common.ServiceResult;
import org.cae.monitor.common.Util;
import org.cae.monitor.entity.CpuInfo;
import org.cae.monitor.entity.JVMClassLoad;
import org.cae.monitor.entity.JVMMemory;
import org.cae.monitor.entity.JVMThread;
import org.cae.monitor.entity.MemoryInfo;
import org.cae.monitor.entity.ProcessInfo;
import org.cae.monitor.remote.IMonitorController;
import org.cae.monitor.service.IMonitorService;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service("monitorService")
public class MonitorServiceImpl implements IMonitorService {

	@Resource(name="&rmiBeanFactory")
	private RmiProxyFactoryBean rmiBeanFactory;
	private static IMonitorController currentServer;
	@Resource(name="serversInfo")
	private List<ServerInfo> servers;
	private static List<CpuInfo> cpuInfo = new LinkedList<CpuInfo>();
	private static List<MemoryInfo> memoryInfo = new LinkedList<MemoryInfo>();
	private static List<ProcessInfo> processInfo = new LinkedList<ProcessInfo>();
	private static List<JVMMemory> jvmMemoryInfo = new LinkedList<JVMMemory>();
	private static List<JVMThread> jvmThreadInfo = new LinkedList<JVMThread>();
	private static List<JVMClassLoad> jvmClassLoadInfo = new LinkedList<JVMClassLoad>();
	
	@PostConstruct
	public void init(){
		for(ServerInfo server:servers){
			IMonitorController serverRemote=getRemote(server);
			if(serverRemote==null){
				server.setAvailable(false);
			}
			else{
				server.setAvailable(true);
				server.setRemote(serverRemote);
			}
		}
		currentServer=servers.get(0).getRemote();
	}
	
	private IMonitorController getRemote(ServerInfo server){
		try{
			String serviceUrl="rmi://"+server.getServerIp()+":"+server.getServerPort()+"/monitor";
			rmiBeanFactory.setServiceUrl(serviceUrl);
			rmiBeanFactory.afterPropertiesSet();
			return (IMonitorController) rmiBeanFactory.getObject();
		}catch(Exception ex){
			return null;
		}
	}
	
	@Override
	public ServiceResult queryForHomepageService() {
		ServiceResult result=new ServiceResult();
		try{
			result.setSuccessed(true);
			result.setResult(currentServer.queryForHomepageController());
		}catch(Exception ex){
			result.setSuccessed(false);
		}
		return result;
	}

	@Override
	public ServiceResult heartbeatService() {
		ServiceResult result=new ServiceResult();
		result.setSuccessed(true);
		result.setResult(servers);
		return result;
	}

	@Override
	public ServiceResult queryCpuService() {
		ServiceResult result=new ServiceResult();
		result.setSuccessed(true);
		result.setResult(cpuInfo);
		return result;
	}

	@Override
	public ServiceResult queryMemoryService() {
		ServiceResult result=new ServiceResult();
		result.setSuccessed(true);
		result.setResult(memoryInfo);
		return result;
	}

	@Override
	public ServiceResult queryProcessService() {
		ServiceResult result=new ServiceResult();
		result.setSuccessed(true);
		result.setResult(processInfo);
		return result;
	}

	@Override
	public ServiceResult queryJvmMemoryService() {
		ServiceResult result=new ServiceResult();
		result.setSuccessed(true);
		result.setResult(jvmMemoryInfo);
		return result;
	}

	@Override
	public ServiceResult queryJvmThreadService() {
		ServiceResult result=new ServiceResult();
		result.setSuccessed(true);
		result.setResult(jvmThreadInfo);
		return result;
	}

	@Override
	public ServiceResult queryJvmClassService() {
		ServiceResult result=new ServiceResult();
		result.setSuccessed(true);
		result.setResult(jvmClassLoadInfo);
		return result;
	}

	@Override
	public ServiceResult exchangeService(ServerInfo serverInfo) {
		for(ServerInfo server:servers){
			if(serverInfo.getServerId().equals(server.getServerId())){
				currentServer=server.getRemote();
			}
		}
		cpuInfo.clear();
		memoryInfo.clear();
		processInfo.clear();
		jvmMemoryInfo.clear();
		jvmThreadInfo.clear();
		jvmClassLoadInfo.clear();
		return new ServiceResult(true);
	}

	@Scheduled(cron="* * * * * *")
	public void heartbeatTask(){
		for(ServerInfo server:servers){
			if(!server.isAvailable()){
				IMonitorController serverRemote=getRemote(server);
				if(serverRemote!=null){
					server.setAvailable(true);
					server.setRemote(serverRemote);
				}
			}
			else{
				try{
					server.setAvailable(server.getRemote().heartbeatController());
				}catch(Exception ex){
					server.setAvailable(false);
				}
			}
		}
	}
	
	@Scheduled(cron="* * * * * *")
	public void getCpuInfoTask(){
		try{
			CpuInfo cpu=currentServer.queryCpuController();
			addObject2List(cpuInfo,cpu);
		}catch(Exception ex){
			addObject2List(cpuInfo,new CpuInfo(Util.getNowTime()));
		}
	}
	
	@Scheduled(cron="* * * * * *")
	public void getMemoryInfoTask(){
		try{
			MemoryInfo memory=currentServer.queryMemoryController();
			addObject2List(memoryInfo,memory);
		}catch(Exception ex){
			addObject2List(memoryInfo,new MemoryInfo(Util.getNowTime()));
		}
	}
	
	@Scheduled(cron="* * * * * *")
	public void getProcessInfoTask(){
		try{
			ProcessInfo process=currentServer.queryProcessController();
			addObject2List(processInfo, process);
		}catch(Exception ex){
			addObject2List(processInfo, new ProcessInfo(Util.getNowTime()));
		}
	}
	
	@Scheduled(cron="* * * * * *")
	public void getJvmMemoryInfoTask(){
		try{
			JVMMemory jvmMemory=currentServer.queryJvmMemoryController();
			addObject2List(jvmMemoryInfo, jvmMemory);
		}catch(Exception ex){
			addObject2List(jvmMemoryInfo,new JVMMemory(Util.getNowTime()));
		}
	}
	
	@Scheduled(cron="* * * * * *")
	public void getJvmThreadInfoTask(){
		try{
			JVMThread jvmThread=currentServer.queryJvmThreadController();
			addObject2List(jvmThreadInfo, jvmThread);
		}catch(Exception ex){
			addObject2List(jvmThreadInfo, new JVMThread(Util.getNowTime()));
		}
	}
	
	@Scheduled(cron="* * * * * *")
	public void getJvmClassLoadInfoTask(){
		try{
			JVMClassLoad jvmClassLoad=currentServer.queryJvmClassController();
			addObject2List(jvmClassLoadInfo, jvmClassLoad);
		}catch(Exception ex){
			addObject2List(jvmClassLoadInfo, new JVMClassLoad(Util.getNowTime()));
		}
	}
	
	private void addObject2List(List list,Object object){
		if(list.size()>=IConstant.LIST_SIZE){
			list.remove(0);
		}
		list.add(object);
	}
}
