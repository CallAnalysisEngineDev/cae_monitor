package org.cae.monitor.controller.impl;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.cae.monitor.common.ServerInfo;
import org.cae.monitor.common.ServiceResult;

import static org.cae.monitor.common.Util.toJson;

import org.cae.monitor.controller.IMonitorController;
import org.cae.monitor.service.IMonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MonitorControllerImpl implements IMonitorController {

	@Autowired
	private IMonitorService monitorService;
	
	@Override
	@RequestMapping("/index")
	public ModelAndView queryForHomepageController(HttpSession session) {
		ModelAndView mav=new ModelAndView();
		if(session.getAttribute("adminId")==null){
			mav.addObject("errInfo", "请先登录!");
			mav.setViewName("login.jsp");
			return mav;
		}
		ServiceResult result=monitorService.queryForHomepageService();
		mav.addObject("success", result.isSuccessed());
		if(result.isSuccessed()){
			mav.addObject("result", toJson(result.getResult()));
		}
		mav.setViewName("WEB-INF/index.jsp");
		return mav;
	}

	@Override
	@RequestMapping(value="/servers",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> heartbeatController(HttpSession session) {
		if(session.getAttribute("adminId")==null){
			Map<String,Object> theResult=new HashMap<String, Object>();
			theResult.put("success", false);
			theResult.put("errInfo", "登录信息过期");
			return theResult;
		}
		return monitorService.heartbeatService().toMap();
	}

	@Override
	@RequestMapping(value="/cpu",method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> queryCpuController(HttpSession session) {
		if(session.getAttribute("adminId")==null){
			Map<String,Object> theResult=new HashMap<String, Object>();
			theResult.put("success", false);
			theResult.put("errInfo", "登录信息过期");
			return theResult;
		}
		return monitorService.queryCpuService().toMap();
	}

	@Override
	@RequestMapping(value="/memory",method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> queryMemoryController(HttpSession session) {
		if(session.getAttribute("adminId")==null){
			Map<String,Object> theResult=new HashMap<String, Object>();
			theResult.put("success", false);
			theResult.put("errInfo", "登录信息过期");
			return theResult;
		}
		return monitorService.queryMemoryService().toMap();
	}

	@Override
	@RequestMapping(value="/process",method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> queryProcessController(HttpSession session) {
		if(session.getAttribute("adminId")==null){
			Map<String,Object> theResult=new HashMap<String, Object>();
			theResult.put("success", false);
			theResult.put("errInfo", "登录信息过期");
			return theResult;
		}
		return monitorService.queryProcessService().toMap();
	}

	@Override
	@RequestMapping(value="/jvmMemory",method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> queryJvmMemoryController(HttpSession session) {
		if(session.getAttribute("adminId")==null){
			Map<String,Object> theResult=new HashMap<String, Object>();
			theResult.put("success", false);
			theResult.put("errInfo", "登录信息过期");
			return theResult;
		}
		return monitorService.queryJvmMemoryService().toMap();
	}

	@Override
	@RequestMapping(value="/jvmThread",method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> queryJvmThreadController(HttpSession session) {
		if(session.getAttribute("adminId")==null){
			Map<String,Object> theResult=new HashMap<String, Object>();
			theResult.put("success", false);
			theResult.put("errInfo", "登录信息过期");
			return theResult;
		}
		return monitorService.queryJvmThreadService().toMap();
	}

	@Override
	@RequestMapping(value="/jvmClassLoad",method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> queryJvmClassController(HttpSession session) {
		if(session.getAttribute("adminId")==null){
			Map<String,Object> theResult=new HashMap<String, Object>();
			theResult.put("success", false);
			theResult.put("errInfo", "登录信息过期");
			return theResult;
		}
		return monitorService.queryJvmClassService().toMap();
	}

	@Override
	@RequestMapping(value="/exchange",method=RequestMethod.POST)
	public String exchangeController(HttpSession session,ServerInfo serverInfo) {
		if(session.getAttribute("adminId")==null){
			return "login.html";
		}
		return "forward:/";
	}

	@Override
	@RequestMapping(value="/gc",method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> gcController(HttpSession session) {
		if(session.getAttribute("adminId")==null){
			Map<String,Object> theResult=new HashMap<String, Object>();
			theResult.put("success", false);
			theResult.put("errInfo", "登录信息过期");
			return theResult;
		}
		return monitorService.gcService().toMap();
	}

}
