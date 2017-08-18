package org.cae.monitor.entity;

public class ProcessInfo extends Entity {

	private String processName;
	private String processId;
	private String processStartTime;
	private double processMemoryRate;
	private double processCpuRate;

	public String getProcessName() {
		return processName;
	}

	public String getProcessId() {
		return processId;
	}

	public String getProcessStartTime() {
		return processStartTime;
	}

	public double getProcessMemoryRate() {
		return processMemoryRate;
	}

	public double getProcessCpuRate() {
		return processCpuRate;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public void setProcessStartTime(String processStartTime) {
		this.processStartTime = processStartTime;
	}

	public void setProcessMemoryRate(double processMemoryRate) {
		this.processMemoryRate = processMemoryRate;
	}

	public void setProcessCpuRate(double processCpuRate) {
		this.processCpuRate = processCpuRate;
	}
}
