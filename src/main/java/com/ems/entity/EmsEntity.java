package com.ems.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMS")
public class EmsEntity {
	
	
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
 
	private String username;
	
	private String email;
	
	private String password;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setResetToken(String token) {
		
	}
	

	}
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
		
		
		
		
}


