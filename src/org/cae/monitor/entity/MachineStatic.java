package org.cae.monitor.entity;

import java.util.List;

import org.cae.monitor.common.Generator;

public class MachineStatic extends Entity {

	private String userName;
	private String computerName;
	private String userDomain;
	private String ip;
	private String hostName;
	private String osName;
	private String osArch;
	private String osVersion;
	private String osDescription;
	private String osVendor;
	private Integer cpuNum;
	private Integer memoryTotalSize;
	private Integer fileSystemTotalSize;
	private Integer swapSize;
	private List<FileSystem> fileSystem;

	class FileSystem {
		private String fileSystemName;
		private Integer fileSystemAvail;

		public FileSystem(String fileSystemName, Integer fileSystemAvail) {
			this.fileSystemName = fileSystemName;
			this.fileSystemAvail = fileSystemAvail;
		}

		public String getFileSystemName() {
			return fileSystemName;
		}

		public Integer getFileSystemAvail() {
			return fileSystemAvail;
		}
	}

	public String getUserName() {
		return userName;
	}

	public String getComputerName() {
		return computerName;
	}

	public String getUserDomain() {
		return userDomain;
	}

	public String getIp() {
		return ip;
	}

	public String getHostName() {
		return hostName;
	}

	public String getOsName() {
		return osName;
	}

	public String getOsArch() {
		return osArch;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public String getOsDescription() {
		return osDescription;
	}

	public String getOsVendor() {
		return osVendor;
	}

	public Integer getCpuNum() {
		return cpuNum;
	}

	public Integer getMemoryTotalSize() {
		return memoryTotalSize;
	}

	public Integer getFileSystemTotalSize() {
		return fileSystemTotalSize;
	}

	public Integer getSwapSize() {
		return swapSize;
	}

	public List<FileSystem> getFileSystem() {
		return fileSystem;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}

	public void setUserDomain(String userDomain) {
		this.userDomain = userDomain;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public void setOsArch(String osArch) {
		this.osArch = osArch;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public void setOsDescription(String osDescription) {
		this.osDescription = osDescription;
	}

	public void setOsVendor(String osVendor) {
		this.osVendor = osVendor;
	}

	public void setCpuNum(Integer cpuNum) {
		this.cpuNum = cpuNum;
	}

	public void setMemoryTotalSize(Integer memoryTotalSize) {
		this.memoryTotalSize = memoryTotalSize;
	}

	public void setFileSystemTotalSize(Integer fileSystemTotalSize) {
		this.fileSystemTotalSize = fileSystemTotalSize;
	}

	public void setSwapSize(Integer swapSize) {
		this.swapSize = swapSize;
	}

	public void setFileSystem(List<FileSystem> fileSystem) {
		this.fileSystem = fileSystem;
	}

}
