package org.cae.monitor.common;

import org.cae.monitor.entity.Entity;
import org.cae.monitor.remote.IMonitorController;

public class ServerInfo extends Entity{

	private boolean available;
	private String serverId;
	private String serverName;
	private String serverIp;
	private String serverPort;
	private String serverGroup;
	private IMonitorController remote;
	public ServerInfo(){
		this.serverId=Util.getCharId(10);
	}
	public boolean isAvailable() {
		return available;
	}
	public String getServerId() {
		return serverId;
	}
	public void setServerId(String serverId) {
		this.serverId = serverId;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
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
	public String getServerPort() {
		return serverPort;
	}
	public void setServerPort(String serverPort) {
		this.serverPort = serverPort;
	}
	public String getServerGroup() {
		return serverGroup;
	}
	public void setServerGroup(String serverGroup) {
		this.serverGroup = serverGroup;
	}
	public IMonitorController getRemote() {
		return remote;
	}
	public void setRemote(IMonitorController remote) {
		this.remote = remote;
	}
}
