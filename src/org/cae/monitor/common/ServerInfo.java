package org.cae.monitor.common;

import org.cae.monitor.entity.Entity;

public class ServerInfo extends Entity{

	private String serverName;
	private String serverIp;
	private String serverGroup;
	public String getServerName() {
		return serverName;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	public String getServerIp() {
		return serverIp;
	}
	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}
	public String getServerGroup() {
		return serverGroup;
	}
	public void setServerGroup(String serverGroup) {
		this.serverGroup = serverGroup;
	}
}
