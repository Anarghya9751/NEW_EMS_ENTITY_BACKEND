package com.ems.restcontroller;

<<<<<<< HEAD

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
=======
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
>>>>>>> e02605dc41dc06aca6cc72c6422ecd4c47c43e9b
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
import com.ems.entity.EmsEntity;
import com.ems.sendemail.EmsSendEmail;
import com.ems.service.EmsService;


@CrossOrigin(origins = "*")
@RestController
public class EmsRestController {

	    @Autowired 
		private EmsService service;
	    
	    @Autowired
		private EmsSendEmail sendEmailService;

	    
		
	    @PostMapping("/save")
	    public ResponseEntity<String>saveusernameandpassword(@RequestBody EmsEntity entity){
	    	Boolean status = service.saveusernameandpassword(entity);
	    	if(status) {
	    		return new ResponseEntity<String>("User Data saved succesfully",HttpStatus.CREATED);
	    	}
	    	return new ResponseEntity<String>("User Data not saved",HttpStatus.INTERNAL_SERVER_ERROR);
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
	    		return new ResponseEntity<String>("Reset success", HttpStatus.ACCEPTED);
	    	}
	    	return new ResponseEntity<String>("Reset not success", HttpStatus.BAD_REQUEST);
	    }
	    

		@GetMapping("/sent")
		public String sendEmail() {
		sendEmailService.sendEmail("prashanthpodila100@gmail.com", "resetpassword", "http://localhost:3000/");
		
			return "sent success";
			
		
		}

	    
 }
	    

=======
import com.ems.entity.Organization;
import com.ems.service.EmsService;

@RestController
public class EmsRestController {

	@Autowired
	private EmsService emsservice;
	
	@PostMapping("/create")
	public Organization createEms(@RequestBody Organization organization)
	{
		return emsservice.createEms(organization);
	}

	@PutMapping("/update/{Oid}")
	public Organization updateEms(@PathVariable Integer Oid ,@RequestBody Organization organization )
	{
		BeanUtils.copyProperties(Oid, organization);
		return emsservice.updateEms(Oid, organization);
	}
	
	@GetMapping("/organization/{Oid}")
	public ResponseEntity<Organization> getOrganization(@PathVariable Integer Oid){
		Organization organization = emsservice.getById(Oid);
		return new ResponseEntity<>(organization,HttpStatus.OK);	
		
	}
	}
>>>>>>> e02605dc41dc06aca6cc72c6422ecd4c47c43e9b

