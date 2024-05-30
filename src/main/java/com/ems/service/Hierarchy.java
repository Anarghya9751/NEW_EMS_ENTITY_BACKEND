package com.ems.service;

public interface Hierarchy {
	package com.example.service;

	import com.example.dto.OrganisationDTO;

	public interface OrganisationService {
	    OrganisationDTO createOrganisation(OrganisationDTO organisationDTO);
	    OrganisationDTO getOrganisation(String name);
	    void addBranchToOrganisation(String organisationName, BranchDTO branchDTO);
	    void addDepartmentToBranch(String organisationName, String branchName, DepartmentDTO departmentDTO);
	    void addRoleToDepartment(String organisationName, String branchName, String departmentName, RoleDTO roleDTO);
	    void addSubRoleToRole(String organisationName, String branchName, String departmentName, String roleName, SubRoleDTO subRoleDTO);
	}
}
