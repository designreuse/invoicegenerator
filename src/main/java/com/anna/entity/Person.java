package com.anna.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="PERSON")
public class Person {
	
	  @Id
	  @Column(name="id_person")
	  @GeneratedValue
	  private int id;
	
	  @Column(name="firstName")
	  private String firstName;
	  
	  @Column(name="lastName")
	  private String lastName;
	  
	  @Column(name="jobTitle")
	  private String jobTitle;
	  
	  @Column(name="address")
	  private String address;
	  
	  @Column(name="abn")
	  private String abn;
	  
	  @Column(name="mobile")
	  private String mobile;
	  
	  @Column(name="mail")
	  private String mail;
	  
	  @Column(name="bankName")
	  private String bankName;
	  
	  @Column(name="accountName")
	  private String accountName;
	  
	  @Column(name="bsb")
	  private String bsb;
	  
	  @Column(name="accountNumber")
	  private String accountNumber;
	  
//	  @OneToMany(mappedBy="person")
//	   private Set<Invoice> invoices;
//	  
	  
		public Person() {
			super();
		}
	  

	public Person(String firstName, String lastName, String jobTitle,
			String address, String abn, String mobile, String mail,
			String bankName, String accountName, String bsb,
			String accountNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.jobTitle = jobTitle;
		this.address = address;
		this.abn = abn;
		this.mobile = mobile;
		this.mail = mail;
		this.bankName = bankName;
		this.accountName = accountName;
		this.bsb = bsb;
		this.accountNumber = accountNumber;
	}
	
	
	/*
	
	public Set<Invoice> getInvoices() {
		return invoices;
	}


	public void setInvoices(Set<Invoice> invoices) {
		this.invoices = invoices;
	}
*/

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAbn() {
		return abn;
	}


	public void setAbn(String abn) {
		this.abn = abn;
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
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getBsb() {
		return bsb;
	}
	public void setBsb(String bsb) {
		this.bsb = bsb;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	


	public Person createAnna() {
		// TODO Auto-generated method stub
		return null;
	}
	  
	  
	  
	  
	
	}