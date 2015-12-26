package com.ballchen.oa.hrmanage.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hrManage")
public class HRController {
	
	@RequestMapping(value="/toLoginPage",method={RequestMethod.GET})
	public String toLoginPage(){
		return "/hrmanage/login";
	}
}
