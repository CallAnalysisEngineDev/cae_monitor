package org.cae.monitor.dao;

import org.cae.monitor.common.DaoResult;
import org.cae.monitor.entity.Admin;

public interface IAdminDao extends IBaseDao {

	DaoResult getAdminInfoDao(Admin admin);
}
