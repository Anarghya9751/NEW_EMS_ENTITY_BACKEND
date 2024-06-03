package com.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.entity.EmsEntity;
import com.ems.service.EmsService;

@RestController
public class EmsController {
	
	@Autowired
	private EmsService service;
	
	@PostMapping("/join")
	public ResponseEntity<String>SaveUser(@RequestBody EmsEntity user){
		boolean status = service.SaveUser(user);
		if (status) {
			return new ResponseEntity<String>("saved",HttpStatus.CREATED);
			
		}
		return new ResponseEntity<String>("not saved",HttpStatus.INTERNAL_SERVER_ERROR);

	}
	
	
	
	
	
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody EmsEntity loginRequest) {
        boolean isValidUser =service.validateUser(loginRequest.getUsername(), loginRequest.getPassword());
        if (isValidUser) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.internalServerError().body("Invalid username or password");
        }
    }

    
    
    	
	
	
	@GetMapping("/forgot")
	public ResponseEntity<String>forgotPassword(String email){
		service.forgotPassword(email);
		return ResponseEntity.ok("password reset link sent successfully");
	}

}
