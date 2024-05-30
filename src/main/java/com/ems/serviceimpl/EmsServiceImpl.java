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
	

}
