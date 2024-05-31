package com.ems.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMS-DT")
public class EmsEntity {

		@Id
	    @GeneratedValue (strategy = GenerationType.IDENTITY)		
		private long UserId;
		private String Username;
		private String Password;
		public long getUserId() {
			return UserId;
		}
		public void setUserId(long userId) {
			UserId = userId;
		}
		public String getUsername() {
			return Username;
		}
		public void setUsername(String username) {
			Username = username;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
		
		
		
}

