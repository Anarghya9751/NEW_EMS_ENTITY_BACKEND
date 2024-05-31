package com.ems.dto;

import java.util.ArrayList;
import java.util.List;

public class OrganizationDTO {
	private String name;
	private List<BranchDTO> branches = new ArrayList<>();

	public OrganizationDTO(String name, List<BranchDTO> branches) {
		this.name = name;
		this.branches = branches;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<BranchDTO> getBranches() {
		return branches;
	}

	public void setBranches(List<BranchDTO> branches) {
		this.branches = branches;
	}
}
