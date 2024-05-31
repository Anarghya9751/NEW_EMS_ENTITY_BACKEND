package com.ems.services;

import com.ems.entity.EmsEntity;

public interface EmsService {


		public Boolean saveUsernamePassword(EmsEntity user);		
        

	    public boolean validateUser(String Username, String oldPassword);
	    
	    
	    public void updatePassword(String Username, String newPassword);


	    

		 
}


