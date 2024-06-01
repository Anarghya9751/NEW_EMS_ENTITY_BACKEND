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
<<<<<<< HEAD
		private long UserId;
		private String Username;
		private String Password;
		public long getUserId() {
			return UserId;
=======
		private long emsId;
		private String emsUserName;
		private String emsPassword;
		
		public long getEmsId() {
			return emsId;
>>>>>>> 4fa85796c38a6df67cd2fe03753730e5c5464f24
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

