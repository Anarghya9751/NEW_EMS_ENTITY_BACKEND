package com.ems.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.entity.BranchEntity;
import com.ems.repository.BranchRepo;
import com.ems.service.BranchService;

@Service
public class BranchServiceImpl implements BranchService{

	@Autowired
	private BranchRepo Repo;

	@Override
	public Boolean SaveEms(BranchEntity entity) {
		Repo.save(entity);
		return true;
	}

	
	

}
