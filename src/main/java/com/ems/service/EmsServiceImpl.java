package com.ems.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.entity.Organization;
import com.ems.repository.EmsRepository;

@Service
public class EmsServiceImpl implements EmsService {
 @Autowired
  private EmsRepository emsrepo;

@Override
public Organization createEms(Organization organization) {
	return emsrepo.save(organization);
}

@Override
public Organization updateEms(Integer Oid,Organization organization) {
	organization.setOid(Oid);
	return emsrepo.save(organization);
}
}
	


	
