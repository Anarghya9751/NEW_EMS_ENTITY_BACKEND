package com.ems.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ems.entity.DepartmentEntity;
import com.ems.service.DepartmentService;

public class DepartmentRestControll {
	
	@Autowired
	private DepartmentService Service;
	
	@PostMapping("/done")
	public ResponseEntity<String>SaveDepartment(@RequestBody DepartmentEntity entity){
		Boolean Status = Service.SaveDepartment(entity);
		if(Status) {
			return new ResponseEntity<String>("Data Saved Successfully",HttpStatus.CREATED);
		}
		return new ResponseEntity<String>("Data  not Saved Successfully",HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
