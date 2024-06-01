package com.ems.restcontroller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.ems.entity.EmsEntity;
import com.ems.service.EmsService;


public class EmsRestController {

	    @Autowired
		private EmsService service;
	    
	    
		
	    @PostMapping("/go")
	    public ResponseEntity<String>saveusernameandpassword(@RequestBody EmsEntity user){
	    	Boolean status = service.saveUsernamePassword(user);
	    	if(status) {
	    		return new ResponseEntity<String>("user saved successfully",HttpStatus.CREATED);
	    	}
	    	return new ResponseEntity<String>("user not saved",HttpStatus.INTERNAL_SERVER_ERROR);
	   	
	    	
	    }
	    
	    
	    
	    @PostMapping("/forgot-password")
	    public ResponseEntity<String> forgotPassword(@RequestParam String username, @RequestParam String email) {
	        service.forgotPassword(username, email);
	        return ResponseEntity.ok("Password reset link sent successfully");
	    }
	    
	  }

	
