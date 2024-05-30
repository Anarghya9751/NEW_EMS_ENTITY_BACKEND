package com.ems.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.entity.BranchEntity;
import com.ems.service.BranchService;

@RestController
public class BranchRestControll {
	
	@Autowired
	private BranchService Service;
	
	@PostMapping("/come")
	public ResponseEntity<String> SaveEms(@RequestBody BranchEntity entity){
		Boolean Status = Service.SaveEms(entity);
		if(Status) {
			return new ResponseEntity<String>("user save successfully",HttpStatus.CREATED);
		}
		return new ResponseEntity<String>("user not save successfully",HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

}
