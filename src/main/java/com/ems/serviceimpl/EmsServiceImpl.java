package com.ems.serviceimpl;


import java.util.UUID;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import com.ems.entity.EmsEntity;
import com.ems.repository.EmsRepository;
import com.ems.service.EmsService;


public class EmsServiceImpl implements EmsService{

	
	
		@Autowired 
		private EmsRepository emsrepo;
		
		
		@Autowired
	    private JavaMailSender javaMailSender;


		@Override
		public Boolean saveUsernamePassword(EmsEntity user) {
			emsrepo.save(user);
			return true;
		}

         
		@Override
	    public void forgotPassword(String username, String email) {
	        EmsEntity user = emsrepo.findByUsername(username);
	        
	        if (user != null && user.getEmail().equals(email)) {
	            String token = UUID.randomUUID().toString();
	            
	            user.setResetToken(token);
	            
	            emsrepo.save(user);
	            
	            sendResetPasswordEmail(user.getEmail(), token);
	        } else {
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


	

		
		





		


    





		
	    
	  

				
		
		

