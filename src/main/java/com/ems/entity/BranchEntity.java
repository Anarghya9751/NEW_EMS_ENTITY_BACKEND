package com.ems.entity;

	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "BRANCH-TAB")
public class BranchEntity {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long BranchID;
        
		private String BranchName;

		private String BranchLocation;

		private String ParentOrg;

		private String Status;

		private String Actions;
		
		public Long getBranchID() {
	return BranchID;
}

public void setBranchID(Long branchID) {
	BranchID = branchID;
}

public String getBranchName() {
	return BranchName;
}

public void setBranchName(String branchName) {
	BranchName = branchName;
}

public String getBranchLocation() {
	return BranchLocation;
}

public void setBranchLocation(String branchLocation) {
	BranchLocation = branchLocation;
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



