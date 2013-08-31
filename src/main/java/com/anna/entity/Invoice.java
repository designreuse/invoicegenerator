package com.anna.entity;

import java.util.Date;
import java.util.Set;

import javax.inject.Inject;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name="INVOICE")
public class Invoice {

	@Id
	@Column(name="id_invoice")
	String id;
	
	@Column(name="date")
	Date date;
	
	@Column(name="company")
	String company;
	
	@Column(name="rate")
	double rate;
	
	@Column(name="typeRate")
	String typeRate;
	
	@Column(name="subtotal")
	double subtotal;
	
	@Column(name="gst")
	double gst;
	
	@Column(name="total")
	double total;
	
	@Column(name="payment_term")
	int paymentTerm;
	
	
	@Inject
	@ManyToOne
	@JoinColumn(name="id_person")
	Person person;
	
	
	@Autowired
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "INVOICE_JOB",
               joinColumns = { @JoinColumn(name = "id_invoice") }, 
               inverseJoinColumns = { @JoinColumn(name = "id_job") })
	Set<Job> jobDoneSet;
	

	

	public Invoice(){
		
		
	}
	

	
	public Invoice(String id, Date date, String company, double rate,
			String typeRate, double subtotal, double gst, double total,
			int paymentTerm, Person person, Set<Job> jobDoneSet) {
		super();
		this.id = id;
		this.date = date;
		this.company = company;
		this.rate = rate;
		this.typeRate = typeRate;
		this.subtotal = subtotal;
		this.gst = gst;
		this.total = total;
		this.paymentTerm = paymentTerm;
		this.person = person;
		this.jobDoneSet = jobDoneSet;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public String getTypeRate() {
		return typeRate;
	}
	public void setTypeRate(String typeRate) {
		this.typeRate = typeRate;
	}
	public Set<Job> getJobDoneSet() {
		return jobDoneSet;
	}
	public void setJobDoneSet(Set<Job> jobDoneSet) {
		this.jobDoneSet = jobDoneSet;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getPaymentTerm() {
		return paymentTerm;
	}
	public void setPaymentTerm(int paymentTerm) {
		this.paymentTerm = paymentTerm;
	}



	public void reset() {
		this.id = null;
		this.date = null;
		this.company = null;
		this.rate = 0.0;
		this.typeRate = null;
		this.subtotal = 0.0;
		this.gst = 0.0;
		this.total = 0.0;
		this.paymentTerm = 0;
		this.person = null;
		this.jobDoneSet.clear();
		
	}


	
	
	
	

	
}
