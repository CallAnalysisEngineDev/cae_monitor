package org.cae.monitor.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

import org.cae.monitor.entity.Admin;

public class Generator {

	public static <K,V> HashMap<K,V> hashMap(){
		return new HashMap<K,V>();
	}
	
	public static <K,V> ConcurrentHashMap<K,V> concurrentHashMap(){
		return new ConcurrentHashMap<K,V>();
	}
	
	public static <T> ArrayList<T> arrayList(){
		return new ArrayList<T>();
	}
	
	public static Admin admin(){
		return new Admin.Builder().build();
	}
	
	public static Admin admin(Integer adminId){
		return new Admin.Builder()
					.adminId(adminId)
					.build();
	}
}
