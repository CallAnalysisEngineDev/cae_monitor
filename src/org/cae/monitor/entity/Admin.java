package org.cae.monitor.entity;

public class Admin extends Entity {

	private Integer adminId;
	private String adminUseraccount;
	private String adminPassword;
	private String adminUsername;
	public Admin(Integer adminId){
		this.adminId=adminId;
	}
	public Admin(String adminUseraccount,String adminPassword){
		this.adminUseraccount=adminUseraccount;
		this.adminPassword=adminPassword;
	}
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	public String getAdminUseraccount() {
		return adminUseraccount;
	}
	public void setAdminUseraccount(String adminUseraccount) {
		this.adminUseraccount = adminUseraccount;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public String getAdminUsername() {
		return adminUsername;
	}
	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}
	
}
