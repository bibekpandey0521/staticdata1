package com.appsoft.springtestdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.appsoft.springtestdemo.model.User;
import com.appsoft.springtestdemo.repository.UserRepository;

@Controller
public class SignUpController {
	
	@Autowired
	private  UserRepository userRepo;
	
	 @GetMapping("/signup")
	  public String getSignUp() {
	        return "SignupForm"; 
	    }

	    @PostMapping("/signup") 
	    public String postSignUp(@ModelAttribute User user, Model model) 
	    {
	    	
	    	//	   
	    	/*
	    	 * -----------How To connect database in spring boot project ---------
	    	 * 1. Add Dependency  of Spring Data JPA "{hibernate + Spring Api }"
	    	 * 2 . Add Dependency of "MySQL Connector" 
	    	 */
	    	userRepo.save(user); //insert user data in database in table
	    	
	    	return "LoginForm";
	    }
	
}
