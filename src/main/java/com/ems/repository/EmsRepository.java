<<<<<<< HEAD
package com.ems.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.entity.EmsEntity;


public interface EmsRepository extends JpaRepository<EmsEntity, Long> {
	
    Optional<EmsEntity> findByUsername(String username);
    


	EmsEntity findByEmail(String email);

}
=======
package com.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.entity.EmsEntity;

public interface EmsRepository extends JpaRepository<EmsEntity, Long>{

	EmsEntity findByEmsUserName(String emsUserName);



}
>>>>>>> 057bca4a3891e1201ff065e9702d327d5f2f91ca
