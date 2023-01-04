package com.masai.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exceptions.UserNotFoundException;
import com.masai.models.User;
import com.masai.services.UserService;
import com.masai.services.UserServiceImpl;

@RestController
public class UserRegistrationController {
	 @Autowired
     private UserService uService;
	 
	 @Autowired
     private UserServiceImpl impl;
	 
	
      @GetMapping("/check")
      public String chheking() {
    	  return "Welcome  Here!";
      }
      
     
      
      
    @PostMapping("/add")
   	public ResponseEntity<User> RegisterUser( @RequestBody @Valid User user) throws UserNotFoundException {
  		
  		User savedUser= uService.addUser(user);
  		
  		
  		return new ResponseEntity<User>(savedUser,HttpStatus.CREATED);
  	}
      
      
}
