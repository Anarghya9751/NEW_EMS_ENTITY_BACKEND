package com.ems.service;

import java.util.List;

import com.ems.entity.BranchEntity;

public interface BranchService {
	
	public Boolean SaveEms(BranchEntity entity);
	
	public BranchEntity getBranchbyId(Long BranchId);
	
	public String deleteById(Long BranchId);
	
	public Boolean Updateuser(BranchEntity entity,Long BranchId );
	
	public List<BranchEntity>getAllUser();

	
}
