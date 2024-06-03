package com.ems.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
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

	@Override
	public Boolean Updateuser(BranchEntity entity, Long BranchId) {
		Optional<BranchEntity> optionalbranch = Repo.findById(BranchId);
		if(optionalbranch.isPresent()) {
			BranchEntity branchEntity = optionalbranch.get();
			
			BeanUtils.copyProperties(entity, branchEntity);
			branchEntity.setBranchID(BranchId);
			Repo.save(branchEntity);
			return true;
		}
		return false;
	}
	@Override
	public List<BranchEntity> getAllems() 
	{
		return Repo.findAll();
	}

	@Override
	public List<BranchEntity> getAllUser() {
		
		return Repo.findAll();
	}

	

}
