package org.cae.monitor.entity;

import java.util.List;

public class CpuInfo extends Entity {

	private String time;
	private List<Cpu> cpus;
	private double cpuTotalUseRate;

	public String getTime() {
		return time;
	}

	public List<Cpu> getCpus() {
		return cpus;
	}

	public double getCpuTotalUseRate() {
		return cpuTotalUseRate;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setCpus(List<Cpu> cpus) {
		this.cpus = cpus;
	}

	public void setCpuTotalUseRate(double cpuTotalUseRate) {
		this.cpuTotalUseRate = cpuTotalUseRate;
	}

}
