package org.cae.monitor.entity;

public class JVMStatic extends Entity {

	private String jvmName;
	private String jvmVersion;
	private String jvmVendor;
	private String jvmStartTime;
	private String jvmInputArgs;
	private Integer jvmAvailableProcessors;
	private Integer jvmMemoryTotal;

	public String getJvmName() {
		return jvmName;
	}

	public String getJvmVersion() {
		return jvmVersion;
	}

	public String getJvmVendor() {
		return jvmVendor;
	}

	public String getJvmStartTime() {
		return jvmStartTime;
	}

	public String getJvmInputArgs() {
		return jvmInputArgs;
	}

	public Integer getJvmAvailableProcessors() {
		return jvmAvailableProcessors;
	}

	public Integer getJvmMemoryTotal() {
		return jvmMemoryTotal;
	}

	public void setJvmName(String jvmName) {
		this.jvmName = jvmName;
	}

	public void setJvmVersion(String jvmVersion) {
		this.jvmVersion = jvmVersion;
	}

	public void setJvmVendor(String jvmVendor) {
		this.jvmVendor = jvmVendor;
	}

	public void setJvmStartTime(String jvmStartTime) {
		this.jvmStartTime = jvmStartTime;
	}

	public void setJvmInputArgs(String jvmInputArgs) {
		this.jvmInputArgs = jvmInputArgs;
	}

	public void setJvmAvailableProcessors(Integer jvmAvailableProcessors) {
		this.jvmAvailableProcessors = jvmAvailableProcessors;
	}

	public void setJvmMemoryTotal(Integer jvmMemoryTotal) {
		this.jvmMemoryTotal = jvmMemoryTotal;
	}
}
