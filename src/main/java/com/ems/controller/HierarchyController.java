package com.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HierarchyController {
	@Autowired
	public OrganizationDTO repository;
	@GetMapping("/getOrganizationDTO")
	public List<OrganizationDTO> OrginizationDTO(){
		return repository.findALl();
		
	}
	public BranchDTODTO repository;
	@GetMapping("/getBranchDTO")
	public List<BranchDTO> BranchDTO(){
		return repository.findAll();
	}
	public DepartmentDTO repository;
	@GetMapping("/getDepartmentDTO")
	public List<DepartmentDTO> DepartmentDTO(){
		return repository.findAll();
	}
	
	public RoleDTO repository;
	@GetMapping("/getRoleDTO")
	public List<RoleDTO> RoleDTO(){
		return repository.findAllRole
	}

}
