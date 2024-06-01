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
<<<<<<< HEAD

=======

<<<<<<< HEAD
	

=======
>>>>>>> 6ea4028129b79d9c066b4dff0b815471470b732d
>>>>>>> 78c95d0677ca72b957cffcd64d6019603fd964b8
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

<<<<<<< HEAD
=======

<<<<<<< HEAD
=======
>>>>>>> 78c95d0677ca72b957cffcd64d6019603fd964b8
}
>>>>>>> 6ea4028129b79d9c066b4dff0b815471470b732d
