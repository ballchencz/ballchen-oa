package com.ballchen.oa.hrmanage.controller;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ballchen.oa.hrmanage.service.IHrmanageService;

@Controller
@RequestMapping("/hrManage")
public class HRController {
	@Autowired
	private IHrmanageService hrmanageService;
	
	/**
	 * 转向人资管理登录页面
	 * @return String 页面路径
	 */
	@RequestMapping(value="/toLoginPage",method={RequestMethod.GET})
	public String toLoginPage(){
		return "/hrmanage/login";
	}
	
	/**
	 * 人资管理登录（暂时方法，以后会通过spring-security进行登陆的统一控制）
	 * @return String 页面路径
	 */
	@RequestMapping(value="/login",method={RequestMethod.POST})
	@ResponseBody
	public Map<String,Object> login(){
		Map<String,Object> returnValue = new HashMap<String,Object>();
		returnValue.put("info", "登录成功");
		returnValue.put("flag", true);
		return returnValue;
	}
	
	/**
	 * 转向人力资源管理主页面
	 * @return String 页面路径
	 */
	@RequestMapping(value="/toHrmanageMainPage",method={RequestMethod.GET})
	public String toHrmanageMainPage(){
		return "/hrmanage/main";
	}
	
	/**
	 * 获得人力资源管理主页面头部
	 * @return 页面路径
	 */
	@RequestMapping(value="/toHrmanageMainPageTop",method={RequestMethod.GET})
	public String toHrmanageTopPage(){
		return "/hrmanage/top";
	}
	
	/**
	 * 获得人力资源管理主页面左侧
	 * @return 页面路径
	 */
	@RequestMapping(value="/toHrmanageMainPageLeft",method={RequestMethod.GET})
	public String toHrmanageLeftPage(){
		return "/hrmanage/left";
	}
	
	@RequestMapping(value="/toMainCenterPage",method={RequestMethod.GET})
	public String toMainCenterPage(){
		return "/hrmanage/center";
	}
}
