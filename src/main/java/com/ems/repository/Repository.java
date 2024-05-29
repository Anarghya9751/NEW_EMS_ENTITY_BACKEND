package com.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.entity.UserEntity;

public interface Repository extends JpaRepository<UserEntity, Long> {
    UserEntity findByUserName(String UserName);


}
