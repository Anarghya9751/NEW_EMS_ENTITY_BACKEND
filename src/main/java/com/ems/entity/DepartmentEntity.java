package com.ems.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
<<<<<<< HEAD
@Table(name = "Department-Tab")
public class DepartmentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
=======
@Table(name="Dep-tab")
public class DepartmentEntity 
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
>>>>>>> 57335af968d4d58837d339bf38c13935a75f69de
	private Long DepartmentId;
	
	private String DepartmentName;
	
	private String ParentBranch;
	
	private String ParentOrg;
	
<<<<<<< HEAD
	private String Status;
=======
	private String status;
>>>>>>> 57335af968d4d58837d339bf38c13935a75f69de
	
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
<<<<<<< HEAD
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
=======
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
>>>>>>> 57335af968d4d58837d339bf38c13935a75f69de
	}

	public String getActions() {
		return Actions;
	}

	public void setActions(String actions) {
		Actions = actions;
	}
	
<<<<<<< HEAD
	
	

=======
>>>>>>> 57335af968d4d58837d339bf38c13935a75f69de
}
