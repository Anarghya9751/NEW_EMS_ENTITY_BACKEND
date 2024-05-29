package com.ems.service;

import com.ems.entity.UserEntity;

public interface Service {

	public UserEntity login(String username, String password);
    void forgetPassword(String email);

}
