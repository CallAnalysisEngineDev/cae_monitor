package org.cae.monitor.entity;

public class Cpu extends Entity{
	
	private String cpuType;
	private double useRate;
	
	public Cpu(){}

	public String getCpuType() {
		return cpuType;
	}

	public double getUseRate() {
		return useRate;
	}
}