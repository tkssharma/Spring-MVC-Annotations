package com.spring.controller;

import com.sun.jndi.cosnaming.IiopUrl.Address;

public class Student {
	
	public String email;
	public String password;
	public Long mobno;
	
	public address studentaddress;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getMobno() {
		return mobno;
	}
	public void setMobno(Long mobno) {
		this.mobno = mobno;
	}
	public address getStudentaddress() {
		return studentaddress;
	}
	public void setStudentaddress(address studentaddress) {
		this.studentaddress = studentaddress;
	}
	
	
	
}
