package com.ems.repository;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	import com.ems.entity.BranchEntity;

	@Repository
	public interface BranchRepo extends JpaRepository<BranchEntity, Long> {

	}