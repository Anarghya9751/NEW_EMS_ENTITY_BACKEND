package com.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.entity.EmsEntity;


public interface EmsRepository extends JpaRepository<EmsEntity, Long>{
	EmsEntity findByUsername(String username);
	EmsEntity findByEmail(String Email);

}
