package com.appsoft.springtestdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appsoft.springtestdemo.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	//for user login
	/*
	 * * 1.findByUsernameAndPassword(String username, String psw);
	 *  
	 */
	 User findByUsernameAndPassword(String username, String psw);
	 
	
	//Custom query methods can be added here if needed
    //For example, findBy 
}
