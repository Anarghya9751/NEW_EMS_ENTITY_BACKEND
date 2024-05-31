package com.ems.service;

import com.ems.entity.Organization;

public interface EmsService {

	public Organization createEms(Organization organization);
	
	public Organization updateEms(Integer Oid,Organization organization);
	
}
