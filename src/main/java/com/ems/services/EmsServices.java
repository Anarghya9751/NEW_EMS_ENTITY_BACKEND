package com.ems.services;

import org.springframework.http.ResponseEntity;

import com.ems.entity.EmsEntity;

public interface EmsServices {

		public boolean saveusernameandpassword(EmsEntity entity);

		public ResponseEntity<String> loginUser(String email) ;
		

}
