package com.ems.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.entity.EmsEntity;

public interface EmsRepository extends JpaRepository<EmsEntity, Long>{
<<<<<<< HEAD
	Optional<EmsEntity> findByUsername(String Username);
    Optional<EmsEntity> findById(Long id);
=======

	EmsEntity findByEmsUserName(String emsUserName);


>>>>>>> 4fa85796c38a6df67cd2fe03753730e5c5464f24

}
