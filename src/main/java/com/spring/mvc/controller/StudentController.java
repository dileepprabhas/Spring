package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.dto.StudentDto;


@Controller
public class StudentController {
	
	@RequestMapping(value="/student", method=RequestMethod.GET)
	public ModelAndView student(){
		return new ModelAndView("Student","command",new StudentDto());
	}

	
	 @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
     public String addStudent(@ModelAttribute("SpringWeb")StudentDto student, 
  
  ModelMap model) {
     model.addAttribute("name", student.getName());
     model.addAttribute("age", student.getAge());
     model.addAttribute("id", student.getId());
     
     return "result";
  }
	
}
