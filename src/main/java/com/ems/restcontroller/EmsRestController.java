package com.ems.restcontroller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.entity.EmsEntity;
import com.ems.repository.EmsRepository;
import com.ems.services.EmsServices;

@CrossOrigin(origins = "*")
@RestController
public class EmsRestController {

	    @Autowired
		private EmsServices service;
	    
	    @Autowired
	    private EmsRepository emsRepo;
		
	    @PostMapping("/save")
	    public ResponseEntity<String>saveusernameandpassword(@RequestBody EmsEntity entity){
	    	Boolean status = service.saveusernameandpassword(entity);
	    	if(status) {
	    		return new ResponseEntity<String>("",HttpStatus.CREATED);
	    	}
	    	return new ResponseEntity<String>("",HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	    
	    @PostMapping("/login")
		public ResponseEntity<String> login(@RequestBody EmsEntity user){
			String email = user.getEmail();
			String password = user.getEmsPassword();
			
			EmsEntity userEmail = emsRepo.findByEmail(email);

			if (!userEmail.equals(email)) {
				 return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
			}
			else {
				return ResponseEntity.ok("valid");
			}
	    }			
 }
	    


