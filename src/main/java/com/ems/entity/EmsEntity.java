package com.ems.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emsdb")
public class EmsEntity {

		@Id
	    @GeneratedValue (strategy = GenerationType.IDENTITY)		
		private long emsId;
		private String emsUserName;
		private String emsPassword;
		private String email;
		
		
		
		
		public EmsEntity(long emsId, String emsUserName, String emsPassword, String email) {
			super();
			this.emsId = emsId;
			this.emsUserName = emsUserName;
			this.emsPassword = emsPassword;
			this.email = email;
		}
		public long getEmsId() {
			return emsId;
		}
		public void setEmsId(long emsId) {
			this.emsId = emsId;
		}
		public String getEmsUserName() {
			return emsUserName;
		}
		public void setEmsUserName(String emsUserName) {
			this.emsUserName = emsUserName;
		}
		public String getEmsPassword() {
			return emsPassword;
		}
		public void setEmsPassword(String emsPassword) {
			this.emsPassword = emsPassword;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		
		
		
		

}


