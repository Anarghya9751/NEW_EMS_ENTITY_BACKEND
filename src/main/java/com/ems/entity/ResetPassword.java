package com.ems.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ResetPassword {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String Username;
    private String oldPassword;
    private String newPassword;
    
		public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
		public String getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	
		}
