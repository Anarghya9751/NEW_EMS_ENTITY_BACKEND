package com.ems.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ems.entity.EmsEntity;
import com.ems.repository.EmsRepository;
import com.ems.services.EmsServices;

@Service
public class EmsServiceImpl implements EmsServices{

	    @Autowired
		private EmsRepository emsrepo;
		@Override
		public boolean saveusernameandpassword(EmsEntity entity) {
		
			emsrepo.save(entity);
			
			return true;
		}
		@Override
	public ResponseEntity<String> loginUser(String email) {
			
			EmsEntity user = emsrepo.findByEmail(email);
			String password = user.getEmsPassword();
		
			if(!user.getEmail().equals(email)) {
				return ResponseEntity.status(HttpStatus.BAD_GATEWAY).build();
			}
			else if(!user.getEmsPassword().equals(password))
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		else
				return ResponseEntity.ok("valid");

	}

}
