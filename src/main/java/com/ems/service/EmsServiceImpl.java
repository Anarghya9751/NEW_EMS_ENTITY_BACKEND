package com.ems.service;
<<<<<<< HEAD
=======

>>>>>>> 719b52ce7760fb566b0fd48291c948d9787f8fca
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.entity.Organization;
import com.ems.repository.EmsRepository;

@Service
public class EmsServiceImpl implements EmsService {
<<<<<<< HEAD
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
	


	
=======

	@Autowired
	public EmsRepository emsrepo;

	@Override
	public Organization createEms(Organization organization) {
		return emsrepo.save(organization);

	}
	
	@Override
	public Organization updateEms(Integer Oid, Organization organization) {
		organization.setOid(Oid);
		return emsrepo.save(organization);
	}
	
} 
>>>>>>> 719b52ce7760fb566b0fd48291c948d9787f8fca
