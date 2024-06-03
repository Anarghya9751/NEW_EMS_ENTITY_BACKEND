package com.ems.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.entity.EmsEntity;


public interface EmsRepository extends JpaRepository<EmsEntity, Long> {
	
    Optional<EmsEntity> findByUsername(String username);
    


	EmsEntity findByEmail(String email);

}
