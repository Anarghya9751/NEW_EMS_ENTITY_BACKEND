package com.ems.serviceImp;

import java.util.Optional;

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

	@Override
	public BranchEntity getBranchbyId(Long BranchId) {
		Optional<BranchEntity> OptionalBranchId = Repo.findById(BranchId);
		if( OptionalBranchId.isPresent()) {
			 BranchEntity branch = OptionalBranchId.get();
			 return branch;
			
		}
		return null;
	}

	@Override
	public String deleteById(Long BranchId) {
		Optional<BranchEntity> OptionalBranchId = Repo.findById(BranchId);
		if( OptionalBranchId.isPresent()) {
			Repo.deleteById(BranchId);
			return "delete";
		}
		return "not Found";
	}

	
	

}
