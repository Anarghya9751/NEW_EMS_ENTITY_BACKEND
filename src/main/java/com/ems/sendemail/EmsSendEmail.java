package com.ems.sendemail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class EmsSendEmail {
	
    @Autowired
				private JavaMailSender javamailsender;
	            
	            @Value("$(spring.mail.username)")
	            
	            private String fromEmailId;
	            
	public void sendEmail(String Recp, String Sub, String Message){
	
		SimpleMailMessage message = new SimpleMailMessage();
		
		message.setFrom(fromEmailId);
		message.setTo(Recp);
		message.setSubject(Sub);
		message.setText(Message);
		
		javamailsender.send(message );
				
	}

}
