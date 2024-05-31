package com.ems.dto;

import java.util.List;

public class BranchDTO {
	private String name;
	private List<DepartmentDTO> departments;

	public BranchDTO(String name, List<DepartmentDTO> departments) {
		this.name = name;
		this.departments = departments;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<DepartmentDTO> getDepartments() {
		return departments;
	}

	public void setDepartments(List<DepartmentDTO> departments) {
		this.departments = departments;
	}
}
