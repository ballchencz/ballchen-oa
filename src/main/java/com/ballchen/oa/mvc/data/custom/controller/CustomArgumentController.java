package com.ballchen.oa.mvc.data.custom.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ballchen.oa.mvc.data.custom.RequestAttribute;

@Controller
@RequestMapping("/customArgument")
public class CustomArgumentController {

	@ModelAttribute
	void beforeInvokingHandlerMethod(HttpServletRequest request) {
		request.setAttribute("foo", "bar");
	}
	
	@RequestMapping(value="/data/custom", method=RequestMethod.GET)
	public @ResponseBody String custom(@RequestAttribute("foo") String foo) {
		return "Got 'foo' request attribute value '" + foo + "'";
	}
	
	@RequestMapping(value="/data/customs", method=RequestMethod.GET)
	public @ResponseBody String customs(@RequestAttribute("foo") String foo) {
		return "Got 'foo' request attribute value '" + foo + "'";
	}

}
