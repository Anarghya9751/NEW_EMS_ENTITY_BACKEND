package com.ems.serviceimpl;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.entity.EmsEntity;
import com.ems.repository.EmsRepository;
import com.ems.services.EmsService;

@Service
public class EmsServiceImpl implements EmsService{

	
	
		@Autowired 
		private EmsRepository emsrepo;


		@Override
		public Boolean saveUsernamePassword(EmsEntity user) {
			emsrepo.save(user);
			return true;
		}

<<<<<<< HEAD

		@Override
		public boolean validateUser(String Username, String oldPassword) {
           Optional<EmsEntity> user = emsrepo.findByUsername(Username);
			return user.isPresent() && user.get().equals(oldPassword);
		}


		@Override
		public void updatePassword(String Username, String newPassword) {
            Optional<EmsEntity> user = emsrepo.findByUsername(Username);	
            if (user.isPresent()) {
            	user.get().setPassword(newPassword);
            	emsrepo.save(user.get());
				
			}
		}


		
		
=======
		@Override
		public EmsEntity getEmsIdById(Long emsId) {
			EmsEntity Id = emsrepo.findById(emsId).get();
			
			return Id;
		}

		@Override
		public String login(String emsUserName, String emsPassword) {
			EmsEntity user = emsrepo.findByEmsUserName(emsUserName);
			if (user == null) {
				return "Invalid username";
			}
			if(!user.getEmsPassword().equals(emsPassword)) {
				return "Invalid password";
				
			}
			return "login success";
		}
>>>>>>> 4fa85796c38a6df67cd2fe03753730e5c5464f24

}



					    
			
		


		


    





		
	    
	  

				
		
		

