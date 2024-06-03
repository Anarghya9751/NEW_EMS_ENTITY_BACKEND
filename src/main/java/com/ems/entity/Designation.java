package com.ems.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DESIGNATIONTABLE")
public class Designation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer Did;
	public String designationName;
	public Integer getDid() {
		return Did;
	}
	public void setDid(Integer did) {
		Did = did;
	}
	public String getDesignationName() {
		return designationName;
	}
	public void setDesignationName(String designationName) {
		this.designationName = designationName;
	}
	public String getParentDepartment() {
		return parentDepartment;
	}
	public void setParentDepartment(String parentDepartment) {
		this.parentDepartment = parentDepartment;
	}
	public String getParentBranch() {
		return parentBranch;
	}
	public void setParentBranch(String parentBranch) {
		this.parentBranch = parentBranch;
	}
	public String getParentOrg() {
		return parentOrg;
	}
	public void setParentOrg(String parentOrg) {
		this.parentOrg = parentOrg;
	}
	public String parentDepartment;
	public String parentBranch;
	public String parentOrg;
}
