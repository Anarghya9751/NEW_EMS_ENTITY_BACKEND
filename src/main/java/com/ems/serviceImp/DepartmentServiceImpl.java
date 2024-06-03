package com.ems.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
=======
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
>>>>>>> 57335af968d4d58837d339bf38c13935a75f69de
import org.springframework.stereotype.Service;

import com.ems.entity.DepartmentEntity;
import com.ems.repository.DepartmentRepo;
import com.ems.service.DepartmentService;

<<<<<<< HEAD
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
=======
   @Service
   public class DepartmentServiceImpl implements DepartmentService
   {
	  @Autowired 
      private DepartmentRepo Repo;
	   
	@Override
	public Boolean saveDep(DepartmentEntity entity) 
	{
		
		Repo.save(entity);
		
		return true;
		
	 
	 }
 
	   
   }
>>>>>>> 57335af968d4d58837d339bf38c13935a75f69de
