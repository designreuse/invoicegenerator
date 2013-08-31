package com.anna.dao;

import java.util.List;

import com.anna.entity.Job;

public interface JobDao {
   	public void addJob(Job invoice);
   	public void updateJob(Job invoice);
   	public Job getJob(int id);
   	public void deleteJob(int id);
   	public List<Job> getJobs();
	

}
