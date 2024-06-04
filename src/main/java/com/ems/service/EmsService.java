<<<<<<< HEAD
package com.ems.service;

import org.springframework.stereotype.Service;

import com.ems.entity.EmsEntity;
@Service
public interface EmsService {

public boolean SaveUser(EmsEntity user);

void forgotPassword(String email);

public boolean validateUser(String username, String password);
}
=======
package com.ems.service;

import com.ems.entity.EmsEntity;

public interface EmsService {

		public boolean saveusernameandpassword(EmsEntity entity);

		EmsEntity getEmsIdById(Long emsId);

		public String login(String emsUserName, String emsPassword);

		Boolean updateemsuser(EmsEntity user, String emsPassword, String emsUserName);
				
}
>>>>>>> 057bca4a3891e1201ff065e9702d327d5f2f91ca
