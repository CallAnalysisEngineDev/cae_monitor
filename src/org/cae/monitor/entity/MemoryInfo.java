package org.cae.monitor.entity;

public class MemoryInfo extends Entity {

	private String time;
	private double memoryUse;
	private double memoryFree;
	private double swapUse;
	private double swapFree;

	public String getTime() {
		return time;
	}

	public double getMemoryUse() {
		return memoryUse;
	}

	public double getMemoryFree() {
		return memoryFree;
	}

	public double getSwapUse() {
		return swapUse;
	}

	public double getSwapFree() {
		return swapFree;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setMemoryUse(double memoryUse) {
		this.memoryUse = memoryUse;
	}

	public void setMemoryFree(double memoryFree) {
		this.memoryFree = memoryFree;
	}

	public void setSwapUse(double swapUse) {
		this.swapUse = swapUse;
	}

	public void setSwapFree(double swapFree) {
		this.swapFree = swapFree;
	}
}
