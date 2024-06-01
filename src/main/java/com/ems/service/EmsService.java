package com.ems.service;

import com.ems.entity.EmsEntity;


public interface EmsService {


		public Boolean saveUsernamePassword(EmsEntity user);
		
	    void forgotPassword(String username, String email);


	   	            
}


