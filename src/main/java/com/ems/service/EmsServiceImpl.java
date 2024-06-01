package com.ems.service;
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
>>>>>>> 6ea4028129b79d9c066b4dff0b815471470b732d
>>>>>>> 78c95d0677ca72b957cffcd64d6019603fd964b8
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
	


	

