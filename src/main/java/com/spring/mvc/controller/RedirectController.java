package com.spring.mvc.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RedirectController {
	static Logger log = Logger.getLogger(RedirectController.class.getName());
	 
	
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	   public String index() {
		log.info("inside redircetController");
	      return "index";
	   }
	
	   @RequestMapping(value = "/redirect", method = RequestMethod.GET)
	   public String redirect() {
	      return "redirect:finalPage";
	   }
	   @RequestMapping(value = "/finalPage", method = RequestMethod.GET)
	   public String finalPage() {
	      return "finalpage";
	   }

}
