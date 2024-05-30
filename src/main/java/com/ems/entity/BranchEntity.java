package com.ems.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Branch-TAB")
public class BranchEntity {

	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		private Long BranchId;
		
		private String BranchName;
		
		private String BranchLocation;
		
		private String PartentOrg;
		
		private String Status;
		
		private String Action;

		public Long getBranchId() {
			return BranchId;
		}

		public void setBranchId(Long branchId) {
			BranchId = branchId;
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

		public String getPartentOrg() {
			return PartentOrg;
		}

		public void setPartentOrg(String partentOrg) {
			PartentOrg = partentOrg;
		}

		public String getStatus() {
			return Status;
		}

		public void setStatus(String status) {
			Status = status;
		}

		public String getAction() {
			return Action;
		}

		public void setAction(String action) {
			Action = action;
		}
		
		
		
		

	

}
