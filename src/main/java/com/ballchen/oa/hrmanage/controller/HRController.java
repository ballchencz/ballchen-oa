package com.ballchen.oa.hrmanage.controller;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ballchen.oa.base.consts.BaseConsts;
import com.ballchen.oa.base.model.PageHelper;
import com.ballchen.oa.base.service.IBaseService;
import com.ballchen.oa.hrmanage.model.UserBasic;
import com.ballchen.oa.hrmanage.service.IHrmanageService;
import com.sun.xml.internal.xsom.impl.parser.BaseContentRef;

@Controller
@RequestMapping("/hrManage")
public class HRController {
	@Autowired
	private IHrmanageService hrmanageService;
	@Autowired
	private IBaseService baseService;
	
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
	public String toMainCenterPage(String title){
		return "/hrmanage/center";
	}
	
	/**
	 * 转向基本信息页面
	 * @param userBasic 用户基本信息
	 * @param pageHelper 分页
	 * @return ModelAndView 带参数视图
	 */
	@RequestMapping(value="/toBaseInfoPage",method={RequestMethod.GET})
	public ModelAndView toBaseInfoPage(UserBasic userBasic,PageHelper pageHelper){
		ModelAndView mv = new ModelAndView("/hrmanage/personnelInformation/personnelInfoManage/baseInfo");
		List<UserBasic> userBasics = this.hrmanageService.getUserBasicByParam(userBasic, pageHelper);
		long total = this.hrmanageService.getUsersTotal(userBasic, pageHelper);
		pageHelper.setTotal(total);
		mv.addObject("userBasics", userBasics);
		mv.addObject("pageHelper",pageHelper);
		mv.addObject("nations", BaseConsts.getAllNationData());
		return mv;
	}
	
	/**
	 * 转向添加或修改页面
	 * @return
	 */
	@RequestMapping(value="/toAddAndEditPage",method={RequestMethod.GET})
	public ModelAndView toAddAndEditPage(){
		ModelAndView mv = new ModelAndView("/hrmanage/personnelInformation/personnelInfoManage/addAndEdit");
		mv.addObject("nationJSONStr", BaseConsts.getAllNationData());
		return mv;
	}
	
	/**
	 * 添加或修改用户基本信息
	 * @param userBasic 用户基本信息
	 * @return Map<String,Object>
	 */
	@RequestMapping(value="/amUserBasic",method={RequestMethod.POST})
	@ResponseBody
	public Map<String,Object> amUserBasic(UserBasic userBasic){
		Map<String,Object> returnMap = null;
		if(userBasic.getId() == null){//当id为空时，为添加
			try {
				userBasic.setAddDate(new Date());
				hrmanageService.saveUserBasic(userBasic);
				returnMap = baseService.getNoramlReturnJSONMap(true, "INSERTTRUE");
			} catch (Exception e) {
				returnMap = baseService.getNoramlReturnJSONMap(false, "INSERTFALSE");
			}
		}else{//当id不为空时，为修改
			returnMap = baseService.getNoramlReturnJSONMap(true, "UPDATETRUE");
		}
		return returnMap;				
	}
	
	
}
