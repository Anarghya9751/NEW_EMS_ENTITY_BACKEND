package com.ems.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.entity.DepartementEntity;
import com.ems.services.DepartementServices;

@RestController
public class DepartementRestController {
	
	@Autowired
	
	private DepartementServices services;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveDepartementData(@RequestBody DepartementEntity entity){
		
		Boolean status = services.saveDepartement(entity);
		
		if(status) {
			return new ResponseEntity<String>("dept save successfully",HttpStatus.CREATED);
		}
		return new ResponseEntity<String>("dept not save successfully",HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
