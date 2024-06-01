package com.ems.emailservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmsEmailService {
	
	
        @Autowired
		private JavaMailSender mailsender;
		public void sendmail(String To,String Message) {
			
			SimpleMailMessage message = new SimpleMailMessage();
			message.setTo(To);
			message.setText(Message);
			
			mailsender.send(message);
			System.out.println("EmailSent");
			
	}
	      
		public void sendmailWithAttachment(String To,String Message) {
			
			SimpleMailMessage message = new SimpleMailMessage();
			message.setTo(To);
			message.setText(Message);
			
			mailsender.send(message);
			System.out.println("EmailSent");
		}	
	

}
