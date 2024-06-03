package com.ems.serviceimpl;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.ems.entity.EmsEntity;
import com.ems.repository.EmsRepository;
import com.ems.service.EmsService;

@Service
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





	




	

