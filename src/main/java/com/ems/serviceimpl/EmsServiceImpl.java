package com.ems.serviceimpl;

<<<<<<< HEAD
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
=======

import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> 057bca4a3891e1201ff065e9702d327d5f2f91ca
import org.springframework.stereotype.Service;

import com.ems.entity.EmsEntity;
import com.ems.repository.EmsRepository;
import com.ems.service.EmsService;

@Service
<<<<<<< HEAD
public class EmsServiceImpl implements EmsService {
	
	@Autowired
	private EmsRepository emsrepo;
	
	@Autowired
	private JavaMailSender javaMailSender;

	@Override
	public boolean SaveUser(EmsEntity user) {
		emsrepo.save(user);
		return true;
	}
	
	
	
	
    public Optional<EmsEntity> findUserByUsername(String username) {
        return emsrepo.findByUsername(username);
    }

    public boolean validateUser(String username, String password) {
        Optional<EmsEntity> user = emsrepo.findByUsername(username);
        return user.isPresent() && user.get().getPassword().equals(password); 
    }

	
	
	
	

	@Override
	public void forgotPassword(String email) {
       EmsEntity user = emsrepo.findByEmail(email);	
       if (user != null && user.getEmail().equals(user)){
    	   String token = UUID.randomUUID().toString();
    	   
    	   user.setResetToken(token);
    	   emsrepo.save(user);
    	   
    	   sendResetPasswordEmail(user.getEmail(),token);
    	   
    	   
       }else {
           throw new RuntimeException("User with provided username and email not found");
       }

		
	}
	

	private void sendResetPasswordEmail(String email, String token) {
		 SimpleMailMessage message = new SimpleMailMessage();
	        message.setTo(email);
	        message.setSubject("Reset Your Password");
	        message.setText("To reset your password, click the link below:\n\n"
	                + "http://yourwebsite.com/reset-password?token=" + token);
	        
	        javaMailSender.send(message);		
	}

		
	}





	




	

=======
public class EmsServiceImpl implements EmsService{

	    @Autowired
		private EmsRepository emsrepo;
		@Override
		public boolean saveusernameandpassword(EmsEntity entity) {
		
			emsrepo.save(entity);
			
			return true;
		}

		@Override
		public EmsEntity getEmsIdById(Long emsId) {
			EmsEntity Id = emsrepo.findById(emsId).get();
			
			return Id;
		}

		@Override
		public String login(String emsUserName, String emsPassword) {
			EmsEntity user = emsrepo.findByEmsUserName(emsUserName);
			if (user == null) {
				return "Invalid username";
			}
			else if(!user.getEmsPassword().equals(emsPassword)) {
				return "Invalid password";
				
			}
			if (user.getEmsUserName().isEmpty() || user.getEmsPassword().isEmpty()) {
				
				return "Invalid username and password";
			}
			return "login success";
		}

		@Override
		public Boolean updateemsuser(EmsEntity user, String emsPassword, String emsUserName) {
		
			EmsEntity byId = emsrepo.findByEmsUserName(emsUserName);
			
			if(!byId.getEmsUserName().isEmpty()) {

				byId.setEmsPassword(emsPassword);
				emsrepo.save(byId);
				return true;
			}
			return false;
		}

}
>>>>>>> 057bca4a3891e1201ff065e9702d327d5f2f91ca
