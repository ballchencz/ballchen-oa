package com.ballchen.oa.base.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ballchen.oa.base.model.JavaBean;

@Controller
@RequestMapping("/main")
public class MainController {
	
	/**
	 * 转向主页面
	 * @return String 主页面相对路径
	 */
	@RequestMapping(value="/toHomePage",method={RequestMethod.GET})
	public String toHomePage(String name){
		return "/main/main";
	}
	
	@RequestMapping(value="/getAjaxData",method={RequestMethod.GET})
	@ResponseBody
	public JavaBean getAjaxData(JavaBean javaBean){
		return javaBean;
	}
}
