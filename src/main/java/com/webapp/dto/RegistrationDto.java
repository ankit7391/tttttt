package com.webapp.dto;

public class RegistrationDto {
     private String firstName; //<<jsp variable names
     private String lastName;  //<<jsp variable names
     private String email;     //<<jsp variable names
     private long mobile;      //<<jsp variable names

     
     //apply getters and setters
     
     public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
     
     
     
     
     
}


// this is a not a entity class
// it is a POJO class like (plan old java object)
