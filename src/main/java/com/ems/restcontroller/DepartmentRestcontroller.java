package com.ems.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import com.ems.entity.DepartmentEntity;
import com.ems.service.DepartmentService;

    public class DepartmentRestcontroller 
   {
    	@Autowired
    	private DepartmentService Service;

        @PostMapping("/Let")	
	   public ResponseEntity<String>save(DepartmentEntity entity)
	   {
		   
		       Boolean status  = Service.saveDep(entity);
		       
		    if(status)
		    {
		    	 return new ResponseEntity<String>("department save succesfully",HttpStatus.CREATED);
		    }
		   
		         return new ResponseEntity<String>("department not save Succesfully",HttpStatus.INTERNAL_SERVER_ERROR);
		   
		   
		   
	   }
	   
    }
