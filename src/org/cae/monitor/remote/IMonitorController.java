package org.cae.monitor.remote;

public interface IMonitorController {

	String queryForHomepageController();

	boolean heartbeatController();

	String getMachineInfo();

	String gcController();
}
