package com.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.dto.OrganizationDTO;

@RestController
public class HierarchyController {
	@Autowired
	public HierarchyServiceImpl hierarchyImpl;

	@RequestMapping("/getOrgDetails/{id}")
	public OrganizationDTO getOrganizationsDetails(@PathVariable("id") long id){
		return hierarchyImpl.getOrganizationsDetails(id);
		
	}
	

}

