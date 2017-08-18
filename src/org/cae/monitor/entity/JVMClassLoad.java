package org.cae.monitor.entity;

public class JVMClassLoad extends Entity {

	private String time;
	private Integer jvmClassLoadedCount;

	public JVMClassLoad(){}
	
	public JVMClassLoad(String time) {
		this.time = time;
	}

	public JVMClassLoad(String time, Integer jvmClassLoadedCount) {
		this.time = time;
		this.jvmClassLoadedCount = jvmClassLoadedCount;
	}

	public String getTime() {
		return time;
	}

	public Integer getJvmClassLoadedCount() {
		return jvmClassLoadedCount;
	}
}
