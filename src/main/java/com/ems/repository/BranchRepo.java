package com.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.entity.BranchEntity;
public interface BranchRepo extends JpaRepository<BranchEntity ,Long>{

	}


