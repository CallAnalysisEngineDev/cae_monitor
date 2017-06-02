package org.cae.monitor.entity;

public class JVMMemory extends Entity {

	private String time;
	private double edenRate;
	private double survivorRate;
	private double oldGenRate;
	private double permGenRate;
	public JVMMemory(){}
	public JVMMemory(String time) {
		this.time=time;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public double getEdenRate() {
		return edenRate;
	}
	public void setEdenRate(double edenRate) {
		this.edenRate = edenRate;
	}
	public double getSurvivorRate() {
		return survivorRate;
	}
	public void setSurvivorRate(double survivorRate) {
		this.survivorRate = survivorRate;
	}
	public double getOldGenRate() {
		return oldGenRate;
	}
	public void setOldGenRate(double oldGenRate) {
		this.oldGenRate = oldGenRate;
	}
	public double getPermGenRate() {
		return permGenRate;
	}
	public void setPermGenRate(double permGenRate) {
		this.permGenRate = permGenRate;
	}
	
}
