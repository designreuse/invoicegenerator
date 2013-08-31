package com.anna.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="JOB")
public class Job {
	
	@Id
	@GeneratedValue
	@Column(name="id_job")
    int id;
	
	@Column(name="date_completed")
	Date dateCompleted;
	
	@Column(name="description")
	String description;
	// units/hours worked
	
	@Column(name="time_worked")
	double time;
	
	
	public Job() {

	}


	public Job(Date dateCompleted, String description, double time) {
		super();
		this.dateCompleted = dateCompleted;
		this.description = description;
		this.time = time;

	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public Date getDateCompleted() {
		return dateCompleted;
	}

	public void setDateCompleted(Date dateCompleted) {
		this.dateCompleted = dateCompleted;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

}
