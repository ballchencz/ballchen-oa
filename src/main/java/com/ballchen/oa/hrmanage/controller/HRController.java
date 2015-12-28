package com.ballchen.oa.hrmanage.controller;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ballchen.oa.hrmanage.model.UserBasic;
import com.ballchen.oa.hrmanage.service.IHrmanageService;

@Controller
@RequestMapping("/hrManage")
public class HRController {
	@Autowired
	private IHrmanageService hrmanageService;
	
	@RequestMapping(value="/toLoginPage",method={RequestMethod.GET})
	public String toLoginPage(){
		UserBasic userBasic = new UserBasic();
		//userBasic.setId(UUID.randomUUID().toString());
		userBasic.setUserName("ChenZhao");
		userBasic.setAddDate(new Date());
		userBasic.setUserSex(0);
		userBasic.setIdNum("37152319930926001X");
		hrmanageService.saveUserBasic(userBasic);
		return "/hrmanage/login";
	}
}
