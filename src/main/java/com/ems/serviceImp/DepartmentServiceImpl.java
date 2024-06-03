package com.ems.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.entity.DepartmentEntity;
import com.ems.repository.DepartmentRepo;
import com.ems.service.DepartmentService;

@Service
public class DepartmentServiceImpl  implements DepartmentService{

	@Autowired
	private DepartmentRepo deptrepo;
	
	@Override
	public Boolean SaveDepartment(DepartmentEntity entity) {
		deptrepo.save(entity);
		return true;
	}
	

}
