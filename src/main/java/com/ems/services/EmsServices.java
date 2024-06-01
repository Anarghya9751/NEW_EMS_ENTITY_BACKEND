package com.ems.services;

import com.ems.entity.EmsEntity;

public interface EmsServices {

		public boolean saveusernameandpassword(EmsEntity entity);

		EmsEntity getEmsIdById(Long emsId);

		public String login(String emsUserName, String emsPassword);

		Boolean updateemsuser(EmsEntity user, String emsPassword, String emsUserName);
				
}
