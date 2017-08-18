package org.cae.monitor.entity;

public class JVMThread extends Entity {

	private String time;
	private Integer jvmDamonThreadCount;
	private Integer jvmActiveThreadCount;

	public String getTime() {
		return time;
	}

	public Integer getJvmDamonThreadCount() {
		return jvmDamonThreadCount;
	}

	public Integer getJvmActiveThreadCount() {
		return jvmActiveThreadCount;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setJvmDamonThreadCount(Integer jvmDamonThreadCount) {
		this.jvmDamonThreadCount = jvmDamonThreadCount;
	}

	public void setJvmActiveThreadCount(Integer jvmActiveThreadCount) {
		this.jvmActiveThreadCount = jvmActiveThreadCount;
	}
}
