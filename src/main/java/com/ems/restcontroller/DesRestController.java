package com.ems.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.entity.Designation;
import com.ems.service.DesService;

@RestController
public class DesRestController {

	@Autowired
	private DesService desservice;
	
	@PostMapping("/create")
	public Designation createDes(@RequestBody Designation designation)
	{
		return desservice.createDes(designation);
	}
	
}
