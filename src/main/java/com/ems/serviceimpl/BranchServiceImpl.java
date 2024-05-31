package com.ems.serviceimpl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.entity.BranchEntity;
import com.ems.repository.BranchRepo;
import com.ems.services.BranchServices;

@Service
public class BranchServiceImpl implements BranchServices {


		@Autowired
		
		private BranchRepo branchrepo;
		
		@Override
		public Boolean saveBranch(BranchEntity entity) {
			branchrepo.save(entity);
			return true;
		}

		@Override
		public Boolean updateBranch(BranchEntity branch, Long branchId) {
			Optional<BranchEntity>  optionalBranch = branchrepo.findById(branchId);
			if(optionalBranch.isPresent()) {
				BranchEntity  branchEntity = optionalBranch.get();
				BeanUtils.copyProperties(branch,branchEntity);
				branchEntity.setBranchId(branchId);
				branchrepo.save(branchEntity);
				return true;
			}
			return false;
		}

		@Override
		public String deleteById(Long branchId) {
			Optional<BranchEntity>    OptionalBranchId = branchrepo.findById(branchId);
			if(OptionalBranchId.isPresent()) {
				branchrepo.deleteById(branchId);
				return "delete";
			}
			return "not found";
		}

		

	

}
