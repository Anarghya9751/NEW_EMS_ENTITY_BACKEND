package com.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ems.entity.Organization;

@Repository
public interface EmsRepository extends JpaRepository<Organization, Integer> {

}
