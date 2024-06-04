package com.ems.dto;

import java.util.ArrayList;
import java.util.List;

public class DepartmentDTO {
	private String name;
	private List<DesignationDTO> roles  = new ArrayList<>();
	
	public DepartmentDTO() {
	}

	public DepartmentDTO(String name, List<DesignationDTO> roles) {
		this.name = name;
		this.roles = roles;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<DesignationDTO> getRoles() {
		return roles;
	}

	public void setRoles(List<DesignationDTO> roles) {
		this.roles = roles;
	}
}
