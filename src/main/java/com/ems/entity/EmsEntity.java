package com.ems.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMS-IN")
public class EmsEntity {

		@Id
	    @GeneratedValue (strategy = GenerationType.IDENTITY)	
		private Long userId;
		private String username;
		private String password;
		private String email;
		private String resetToken;
		public Long getUserId() {
			return userId;
		}
		public void setUserId(Long userId) {
			this.userId = userId;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getResetToken() {
			return resetToken;
		}
		public void setResetToken(String resetToken) {
			this.resetToken = resetToken;
		}
						
		
}

