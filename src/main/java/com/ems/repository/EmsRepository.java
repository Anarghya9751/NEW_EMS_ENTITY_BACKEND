package com.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD

import com.ems.entity.EmsEntity;

public interface EmsRepository extends JpaRepository<EmsEntity, Long>{

	EmsEntity findByEmsUserName(String emsUserName);

=======
import org.springframework.stereotype.Repository;

import com.ems.entity.Organization;

@Repository
public interface EmsRepository extends JpaRepository<Organization, Integer> {
>>>>>>> e02605dc41dc06aca6cc72c6422ecd4c47c43e9b


}
