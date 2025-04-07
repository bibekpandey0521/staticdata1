package com.appsoft.springtestdemo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.appsoft.springtestdemo.model.User;

@Controller
public class SignUpController {
		
	 @GetMapping("/signup")
	  public String getSignUp() {
	        return "SignupForm"; 
	    }

	    @PostMapping("/signup") 
	    public String postSignUp(@ModelAttribute User user, Model model ,
	    		@RequestParam("gender") String gender,
	    		@RequestParam("city") String city,
	    		@RequestParam("projects") String projects
	    		
	    		) 
	    {
//	        model.addAttribute("unameF",user.getFname());
//	        model.addAttribute("unameL",user.getLname());
//	        model.addAttribute("uname",user.getUsername());
	    	
	    	model.addAttribute("user",user);
	    	model.addAttribute("gender",gender);
	        model.addAttribute("city",city);
	        model.addAttribute("projects", projects);
	        model.addAttribute("ulist",List.of(user,user,user,user));
	    	return "Profile";
	    }
	
}
