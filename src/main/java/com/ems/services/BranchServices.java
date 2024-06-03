package com.ems.services;

import java.util.List;

import com.ems.entity.BranchEntity;

public interface BranchServices {


		
		public Boolean saveBranch(BranchEntity entity);

		public Boolean updateBranch(BranchEntity branch, Long branchId);
		
		public String deleteById(Long branchId);
		
		public List<BranchEntity>  getAllbranch();
		
		public BranchEntity getBranchById(Long branchId);
		
		
	}





