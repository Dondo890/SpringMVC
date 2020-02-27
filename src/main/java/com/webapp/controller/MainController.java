package com.webapp.controller;


import java.util.Objects;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@GetMapping(value= {"/index","/"})
	public ModelAndView indexMapping(Model model) {
		
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("response",Objects.nonNull(model.asMap().get("response")) ? 
				model.asMap().get("response").toString() : null);
		
		return modelAndView;
	}
	
	

}
