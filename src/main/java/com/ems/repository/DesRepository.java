package com.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ems.entity.Designation;

@Repository
public interface DesRepository extends JpaRepository<Designation, Integer> {
	
}
