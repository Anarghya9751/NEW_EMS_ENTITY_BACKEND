package com.ems.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.entity.DepartementEntity;
import com.ems.repository.DepartementRepo;
import com.ems.services.DepartementServices;


	
	@Service
	public class DepartementServiceImpl  implements DepartementServices{

		@Autowired
		
		private DepartementRepo deptRepo;
		
		@Override
		public Boolean saveDepartement(DepartementEntity entity) {
			deptRepo.save(entity);
			return true;
		}

}
