package com.ems.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ORGANIZATIONTABLE")
public class Organization {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer Oid;

	public Integer getOid() {
		return Oid;
	}

	public void setOid(Integer oid) {
		Oid = oid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getPinCode() {
		return pinCode;
	}

	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public Long getPhnNo() {
		return phnNo;
	}

	public void setPhnNo(Long phnNo) {
		this.phnNo = phnNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String name;
	
	public String location;
	
	public String region;
	
	public String address;
	
	public Integer pinCode;
	
	public String state;
	
	public String district;
	
	public Long phnNo;
	
	public String emailId;
	
	public String City;
	
	public String websiteUrl;

	public String getWebsiteUrl() {
		return websiteUrl;
	}

	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}
	
}


