package com.ems.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ems.entity.DepartmentEntity;
import com.ems.repository.DepartmentRepo;
import com.ems.service.DepartmentService;

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
