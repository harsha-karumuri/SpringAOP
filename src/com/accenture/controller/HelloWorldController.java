package com.accenture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public ModelAndView sayHello() {
		
		String msg="Welcome to Spring MVC";
		ModelAndView mv= new ModelAndView();
		mv.addObject("message", msg);
		mv.setViewName("success.jsp");
		return mv;
	}
	
}
