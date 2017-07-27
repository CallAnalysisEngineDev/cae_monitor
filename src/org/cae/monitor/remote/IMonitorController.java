package org.cae.monitor.remote;

public interface IMonitorController {

	String queryForHomepageController();

	boolean heartbeatController();

	String queryCpuController();

	String queryMemoryController();

	String queryProcessController();

	String queryJvmMemoryController();

	String queryJvmThreadController();

	String queryJvmClassController();

	String gcController();
}
