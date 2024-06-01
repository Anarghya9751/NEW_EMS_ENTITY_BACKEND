package com.ems.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
<<<<<<< HEAD

=======
>>>>>>> 6ea4028129b79d9c066b4dff0b815471470b732d
@Table(name="ORGANIZATIONTABLE")

public class Organization {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	public Integer Oid;
	public String  name;
	public String location;
	public String region;
	public String address;
	public Integer pinCode;
	public String state;
	public String district;
	public Long phnNo;
	public String emailId;
	public String city;
	public String websiteUrl;
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
	public Integer getPincode() {
		return pinCode;
	}
	public void setPincode(Integer pincode) {
		this.pinCode = pincode;
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
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getWebsiteUrl() {
		return websiteUrl;
	}
<<<<<<< HEAD
}
	


	



	
=======

}
>>>>>>> 6ea4028129b79d9c066b4dff0b815471470b732d
