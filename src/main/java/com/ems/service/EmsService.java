package com.ems.service;

<<<<<<< HEAD
import com.ems.entity.EmsEntity;

public interface EmsService {

		public boolean saveusernameandpassword(EmsEntity entity);

		EmsEntity getEmsIdById(Long emsId);

		public String login(String emsUserName, String emsPassword);

		Boolean updateemsuser(EmsEntity user, String emsPassword, String emsUserName);
				
=======
import com.ems.entity.Organization;

public interface EmsService {

public Organization createEms(Organization organization);
public Organization updateEms(Integer Oid,Organization organization);
public Organization getById(Integer Oid);

>>>>>>> e02605dc41dc06aca6cc72c6422ecd4c47c43e9b
}
