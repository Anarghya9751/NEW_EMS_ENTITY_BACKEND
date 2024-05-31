package com.ems.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
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

}
