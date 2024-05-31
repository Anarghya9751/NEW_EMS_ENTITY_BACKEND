package com.ems.service;

import com.ems.entity.BranchEntity;

public interface BranchService {
	
	public Boolean SaveEms(BranchEntity entity);
	
	public BranchEntity getBranchbyId(Long BranchId);
	
	public String deleteById(Long BranchId);

	
}
