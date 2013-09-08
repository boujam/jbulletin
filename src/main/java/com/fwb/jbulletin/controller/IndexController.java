package com.fwb.jbulletin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	IndexController(){
		System.out.println("construct bean : [indexController] " + this.toString());
	}
	

	@RequestMapping("/")
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
}
