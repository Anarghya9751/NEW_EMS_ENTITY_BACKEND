package com.ems.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.entity.EmsEntity;
import com.ems.repository.EmsRepository;
import com.ems.service.EmsService;

@Service
public class EmsServiceImpl implements EmsService{

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
			else if(!user.getEmsPassword().equals(emsPassword)) {
				return "Invalid password";
				
			}
			if (user.getEmsUserName().isEmpty() || user.getEmsPassword().isEmpty()) {
				
				return "Invalid username and password";
			}
			return "login success";
		}

		@Override
		public Boolean updateemsuser(EmsEntity user, String emsPassword, String emsUserName) {
		
			EmsEntity byId = emsrepo.findByEmsUserName(emsUserName);
			
			if(!byId.getEmsUserName().isEmpty()) {

				byId.setEmsPassword(emsPassword);
				emsrepo.save(byId);
				return true;
			}
			return false;
		}

}
