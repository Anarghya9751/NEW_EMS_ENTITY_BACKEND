package com.ems.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
		return emsservice.updateEms(Oid, organization);
	}}


