package com.ems.dto;

import java.util.List;

public class DesignationDTO {
	private String name;
	private List<DesignationDTO> subRoles;

	public DesignationDTO(String name, List<DesignationDTO> subRoles) {
		this.name = name;
		this.subRoles = subRoles;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<DesignationDTO> getSubRoles() {
		return subRoles;
	}

	public void setSubRoles(List<DesignationDTO> subRoles) {
		this.subRoles = subRoles;
	}
}
