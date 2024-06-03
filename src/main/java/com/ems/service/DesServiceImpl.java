package com.ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.entity.Designation;
import com.ems.repository.DesRepository;

@Service
public class DesServiceImpl implements DesService {

	 @Autowired
	  private DesRepository desrepo;

	@Override
	public Designation createDes(Designation designation) {
		return desrepo.save(designation);
	}

	
}
