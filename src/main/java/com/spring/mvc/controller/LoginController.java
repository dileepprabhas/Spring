package com.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.dao.UserDao;
import com.spring.mvc.dto.LoginDto;
import com.spring.mvc.dto.UserDto;


@Controller
public class LoginController {
	@Autowired
	UserDao  userService;
	  @RequestMapping(value = "/login", method = RequestMethod.GET)
	  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
	   // ModelAndView mav = new ModelAndView("login");
	  //  mav.addObject("login", new LoginDto());
	   // return mav;
		  return new ModelAndView("login", "login", new LoginDto());
	  }
	
//	  @RequestMapping(value = "/loginProccess", method = RequestMethod.POST) public
//	  ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse
//	  response,
//	  
//	  @ModelAttribute("login") LoginDto login) { ModelAndView mav = null; UserDto
//	  user = userService.validateUser(login); if (null != user) { mav = new
//	  ModelAndView("welcome"); mav.addObject("firstname", user.getFirstname()); }
//	  else { mav = new ModelAndView("login"); mav.addObject("message",
//	  "Username or Password is wrong!!"); } return mav; }
	 

}
