package com.ballchen.oa.base.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
		return "/main/basic";
	}
	
	/**
	 * 转向登录页面
	 * @param id 菜单ID
	 * @return String 登录页面相对路径
	 */
	@RequestMapping(value="/toLoginPage",method={RequestMethod.GET})
	public ModelAndView toLoginPage(String menuId){
		ModelAndView mv = new ModelAndView("/main/login");
		return mv;
	}
	
	/**
	 * 转向主页面
	 * @param menuId 菜单ID
	 * @return
	 */
	@RequestMapping(value="/toMainPage",method={RequestMethod.GET})
	public ModelAndView toMainPage(String menuId){
		ModelAndView mv = new ModelAndView("/main/main");
		
		return mv;
	}
	
	/**
	 * 转向拒绝访问页面
	 * @return ModelAndView
	 */
	@RequestMapping(value="/toAccessDined",method={RequestMethod.GET})
	public ModelAndView toAccessDined(){
		ModelAndView mv = new ModelAndView("/error/403");
		return mv;
	}
	
	/**
	 * 转向报错页面
	 * @return ModelAndView
	 */
	@RequestMapping(value="/toExceptionPage",method={RequestMethod.GET})
	public ModelAndView toExceptionPage(){
		ModelAndView mv = new ModelAndView("/error/500");
		return mv;
	}
	
	/**
	 * 转向未找到页面
	 * @return ModelAndView
	 */
	@RequestMapping(value="/toNotFoundPage",method={RequestMethod.GET})
	public ModelAndView toNotFoundPage(){
		ModelAndView mv = new ModelAndView("/error/404");
		return mv;
	}
	/**
	 * 获得包含基本的标签页面
	 * @return ModelAndView
	 */
/*	@RequestMapping(value="/getIncludeTagPage",method={RequestMethod.GET})
	public ModelAndView getIncludeTagPage(){
		ModelAndView mv = new ModelAndView("/main/basicPageTag");
		return mv;
	}*/
	
/*	@RequestMapping(value="/getAjaxData",method={RequestMethod.GET})
	@ResponseBody
	public JavaBean getAjaxData(JavaBean javaBean){
		return javaBean;
	}*/
}
