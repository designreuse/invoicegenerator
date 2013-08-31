package com.anna.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.anna.entity.Job;

@Repository
@Transactional
public class JobDaoImpl extends AbstractHibernateDAO<Job> implements JobDao  {
 

	@Override
	public void addJob(Job job) {
		getCurrentSession().save(job);

	} 

	@Override
	public void updateJob(Job job) {
		Job jobToUpdate = getJob(job.getId());
	    
//		
//		jobToUpdate.setCompany(job.getCompany());
//		jobToUpdate.setDate(job.getDate());
//		jobToUpdate.setGst(job.getGst());
//		jobToUpdate.setJobDoneList(job.getJobDoneList());
//		jobToUpdate.setPaymentTerm(job.getPaymentTerm());
//		jobToUpdate.setPerson(job.getPerson());
//		jobToUpdate.setPaymentTerm(job.getPaymentTerm());
//		jobToUpdate.setRate(job.getRate());
//		jobToUpdate.setTypeRate(job.getTypeRate());
//		jobToUpdate.setSubtotal(job.getSubtotal());
//		jobToUpdate.setTotal(job.getTotal());

		getCurrentSession().update(job);

	}

	@Override
	public Job getJob(int id) {	
		Job job = (Job) getCurrentSession().get(Job.class, id);
        
		return job;

	}

	@Override
	public void deleteJob(int id) {
		Job jobToDelete = getJob(id);
	  if (jobToDelete != null)
		getCurrentSession().delete(jobToDelete);

	}


	@Override
	public List<Job> getJobs() {
		 return getCurrentSession().createQuery("from Job").list();

	}

}
