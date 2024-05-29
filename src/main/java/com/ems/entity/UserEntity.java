package com.ems.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class UserEntity {
	
	
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
 
	private String UserName;
	
	private String Password;
}
