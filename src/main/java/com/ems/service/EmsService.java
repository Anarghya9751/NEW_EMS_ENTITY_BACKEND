package com.ems.service;

import org.springframework.stereotype.Service;

import com.ems.entity.EmsEntity;
@Service
public interface EmsService {

public boolean SaveUser(EmsEntity user);

void forgotPassword(String email);

public boolean validateUser(String username, String password);

}
