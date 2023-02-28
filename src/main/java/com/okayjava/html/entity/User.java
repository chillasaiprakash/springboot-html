package com.okayjava.html.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

@EntityScan
public class User {
	
	@Id
	private Long id;
	private String firstname;
	private String middlename;
	private String lastname;
	private String currentAddress;
	private String phone;
	private String email;
	private String psw;
	private String psw_repeat;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCurrentAddress() {
		return currentAddress;
	}
	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public String getPsw_repeat() {
		return psw_repeat;
	}
	public void setPsw_repeat(String psw_repeat) {
		this.psw_repeat = psw_repeat;
	}
	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", middlename=" + middlename + ", lastname=" + lastname
				+ ", currentAddress=" + currentAddress + ", phone=" + phone + ", email=" + email + ", psw=" + psw
				+ ", psw_repeat=" + psw_repeat + "]";
	}

	
	
	
	

}
