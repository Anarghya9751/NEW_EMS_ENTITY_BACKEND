package com.ems.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Department-Tab")
public class DepartmentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long DepartmentId;
	
	private String DepartmentName;
	
	private String ParentBranch;
	
	private String ParentOrg;
	
	private String Status;
	
	private String Actions;

	public Long getDepartmentId() {
		return DepartmentId;
	}

	public void setDepartmentId(Long departmentId) {
		DepartmentId = departmentId;
	}

	public String getDepartmentName() {
		return DepartmentName;
	}

	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}

	public String getParentBranch() {
		return ParentBranch;
	}

	public void setParentBranch(String parentBranch) {
		ParentBranch = parentBranch;
	}

	public String getParentOrg() {
		return ParentOrg;
	}

	public void setParentOrg(String parentOrg) {
		ParentOrg = parentOrg;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getActions() {
		return Actions;
	}

	public void setActions(String actions) {
		Actions = actions;
	}
	
	
	

}
