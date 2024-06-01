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
<<<<<<< HEAD
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
	   
	    
	    





	
 
=======
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
	    
	
 }
>>>>>>> 4fa85796c38a6df67cd2fe03753730e5c5464f24
	    


