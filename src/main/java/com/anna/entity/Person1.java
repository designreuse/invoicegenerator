package com.anna.entity;

public class Person1 {
	  private String firstName;
	  private String lastName;
	  private String address;

	  public Person1(String firstName, String lastName, String address) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.address = address;
	  }

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

	  public String getAddress() {
	    return address;
	  }

	  public void setAddress(String address) {
	    this.address = address;
	  }
	}