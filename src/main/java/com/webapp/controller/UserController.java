package com.webapp.controller;

import java.util.HashMap;
import java.util.Objects;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.webapp.user.dto.UserDto;
import com.webapp.user.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value="/registerpage")
	public ModelAndView registerPage() {
		ModelAndView modelAndView = new ModelAndView("registeruser");
		
		//Add modelAttribute
		modelAndView.addObject("userDto", new UserDto());
		
		return modelAndView;
		
	}
	
	@PostMapping(value="/registeruser")
	public ModelAndView registerUser(@ModelAttribute("userDto")UserDto userDto,
			RedirectAttributes redirectAttribute) {
		ModelAndView modelAndView = new ModelAndView("redirect:/");
		
		redirectAttribute.addFlashAttribute("response", userService.insertUserService(userDto));
		
		return modelAndView;
	}
	
	@PostMapping(value="/loginuser")
	public ModelAndView loginUser(@RequestParam("username")String username,
			@RequestParam("password")String password,
			HttpSession session,
			RedirectAttributes ra) {
		ModelAndView modelAndView = new ModelAndView();
		
		HashMap<String, Object>responseList = userService.loginUserService(username, password);
		
		if(Objects.nonNull(responseList.get("response"))) {
			modelAndView.setViewName("redirect:/");
			ra.addFlashAttribute("response", responseList.get("response"));
		}else {
			session.setAttribute("user", (UserDto)responseList.get("user"));
			modelAndView.setViewName("redirect:/home");
		}
		
		return modelAndView;
	}
	
}
