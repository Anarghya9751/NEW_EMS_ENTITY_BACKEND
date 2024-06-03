package com.ems.entity;



	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;

	@Entity
	@Table(name="DEPT-TAB")

	public class DepartementEntity {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		private Long DepartementId;
		
		private String departementName;
		
		private String parentBranch;
		
		public Long getDepartementId() {
			return DepartementId;
		}

		public void setDepartementId(Long departementId) {
			DepartementId = departementId;
		}

		public String getDepartementName() {
			return departementName;
		}

		public void setDepartementName(String departementName) {
			this.departementName = departementName;
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

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getAction() {
			return action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		private String parentOrg;
		
		private String status;
		
		private String action;






	}


