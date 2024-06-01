package com.ems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.ems.emailservice.EmsEmailService;

@SpringBootApplication
public class NewEmsEntityBackendApplication {

	@Autowired
	private EmsEmailService mailservice;
	
	public static void main(String[] args) {
		SpringApplication.run(NewEmsEntityBackendApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() {
		mailservice.sendmail("harshatendul@gmail.com","restpassword");
		mailservice.sendmailWithAttachment("harshatendul@gmail.com","restpassword");
	}
}
