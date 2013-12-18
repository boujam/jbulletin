package com.fwb.jbulletin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fwb.jbulletin.model.Student;
import com.fwb.jbulletin.service.StudentService;

@Controller
public class StudentCreateController {

	@Autowired StudentService studentService;

	StudentCreateController(){
		System.out.println("construct bean : [studentCreateController] " + this.toString());
	}
	

	@RequestMapping("studentcreate")
	public ModelAndView studentCreate(){
		ModelAndView mv = new ModelAndView("studentcreate");
		mv.addObject("student", new Student());
		return mv;
	}
	
	@RequestMapping("studentcreatesubmit")
	public ModelAndView studentCreateSubmit(@ModelAttribute("student") Student student){
		studentService.create(student);
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("student",student);
		return mv;
	}
	
}
