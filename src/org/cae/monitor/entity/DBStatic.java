package org.cae.monitor.entity;

public class DBStatic extends Entity {

	private String dbName;
	private String dbVersion;
	private String dbDriverName;
	private String dbUrl;
	private String dbUsername;
	private String dbJdbcVersion;

	public String getDbName() {
		return dbName;
	}

	public String getDbVersion() {
		return dbVersion;
	}

	public String getDbDriverName() {
		return dbDriverName;
	}

	public String getDbUrl() {
		return dbUrl;
	}

	public String getDbUsername() {
		return dbUsername;
	}

	public String getDbJdbcVersion() {
		return dbJdbcVersion;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public void setDbVersion(String dbVersion) {
		this.dbVersion = dbVersion;
	}

	public void setDbDriverName(String dbDriverName) {
		this.dbDriverName = dbDriverName;
	}

	public void setDbUrl(String dbUrl) {
		this.dbUrl = dbUrl;
	}

	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}

	public void setDbJdbcVersion(String dbJdbcVersion) {
		this.dbJdbcVersion = dbJdbcVersion;
	}
}
