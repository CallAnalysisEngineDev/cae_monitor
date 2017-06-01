package org.cae.monitor.entity;

import org.cae.monitor.common.Util;

public class Entity {

	public String toString(){
		return Util.toJson(this);
	}
}
