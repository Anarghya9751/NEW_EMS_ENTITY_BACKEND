package com.ems.service;

import java.util.List;

import com.ems.entity.BranchEntity;

public interface BranchService {
	
	public Boolean SaveEms(BranchEntity entity);
	
	public BranchEntity getBranchbyId(Long BranchId);
	
	public String deleteById(Long BranchId);
	
	public Boolean Updateuser(BranchEntity entity,Long BranchId );
	
<<<<<<< HEAD
	public List<BranchEntity>getAllUser();
=======
	public List<BranchEntity>getAllems();

	
	
>>>>>>> 57335af968d4d58837d339bf38c13935a75f69de

	
}
