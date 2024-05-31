package com.ems.restcontroller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.entity.EmsEntity;
import com.ems.entity.ResetPassword;
import com.ems.services.EmsService;

@CrossOrigin(origins = "*")
@RestController
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
	   	   
	    
	    
	    
	    
	  @PostMapping("/reset")  
	  public String resetPassword(ResetPassword request) {
		  if (service.validateUser(request.getUsername(), request.getOldPassword())) {
			  service.updatePassword(request.getUsername(), request.getNewPassword());
			  return "password reset successsfull";
			
		}else {
			return "invali user";
		}
		  
	  }
	    }
	   
	    
	    





	
 
	    


