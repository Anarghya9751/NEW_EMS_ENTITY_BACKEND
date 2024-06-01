package com.ems.restcontroller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.entity.EmsEntity;
import com.ems.services.EmsServices;

@CrossOrigin(origins = "*")
@RestController
public class EmsRestController {

	    @Autowired
		private EmsServices service;
	    
		
	    @PostMapping("/save")
	    public ResponseEntity<String>saveusernameandpassword(@RequestBody EmsEntity entity){
	    	Boolean status = service.saveusernameandpassword(entity);
	    	if(status) {
	    		return new ResponseEntity<String>("saved",HttpStatus.CREATED);
	    	}
	    	return new ResponseEntity<String>("having issue",HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	    
	    @GetMapping("/get/{emsId}")
	    public EmsEntity getById(@PathVariable Long emsId) {
	    		EmsEntity user = service.getEmsIdById(emsId);
	    		return user;
	    	}

	    @PostMapping("/login")
	    public String login(@RequestBody EmsEntity user){
	    	
	    	return service.login(user.getEmsUserName(),user.getEmsPassword());
	    }
	    
	
	    @PutMapping("/reset/{emsUserName}")
	    public ResponseEntity<String>updateUserData(@RequestBody EmsEntity user ,@PathVariable String emsUserName){
	    	
	    	String emsPassword = user.getEmsPassword();
	    	Boolean status = service.updateemsuser(user, emsPassword, emsUserName);
	    
	    	if(status) {
	    		return new ResponseEntity<String>("update success", HttpStatus.ACCEPTED);
	    	}
	    	return new ResponseEntity<String>("update not success", HttpStatus.BAD_REQUEST);
	    }
 }
	    


