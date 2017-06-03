package org.cae.monitor.entity;

import java.util.List;

public class CpuInfo extends Entity{

	private String time;
	private List<Cpu> cpus;
	private double cpuTotalUseRate;
	
	public static class Cpu{
		private String cpuType;
		private double useRate;
		public String getCpuType() {
			return cpuType;
		}
		public void setCpuType(String cpuType) {
			this.cpuType = cpuType;
		}
		public double getUseRate() {
			return useRate;
		}
		public void setUseRate(double useRate) {
			this.useRate = useRate;
		}
	}

	public CpuInfo(){}
	public CpuInfo(String time){
		this.time=time;
	}
	
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public List<Cpu> getCpus() {
		return cpus;
	}

	public void setCpus(List<Cpu> cpus) {
		this.cpus = cpus;
	}

	public double getCpuTotalUseRate() {
		return cpuTotalUseRate;
	}

	public void setCpuTotalUseRate(double cpuTotalUseRate) {
		this.cpuTotalUseRate = cpuTotalUseRate;
	}
	
}
