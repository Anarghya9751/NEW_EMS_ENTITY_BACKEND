package com.ems.services;

import com.ems.entity.BranchEntity;

public interface BranchServices {


		
		public Boolean saveBranch(BranchEntity entity);

		public Boolean updateBranch(BranchEntity branch, Long branchId);
		
		public String deleteById(Long branchId);
		
		
	}




