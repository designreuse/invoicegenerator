package com.anna.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anna.dao.InvoiceDao;
import com.anna.entity.Invoice;
import com.anna.entity.Job;

@Service
@Scope("prototype")
public class InvoiceServiceImpl implements InvoiceService {

	@Autowired
	InvoiceDao invoiceDao;
	

	
	@Override
	@Transactional
	public void addInvoice(Invoice invoice) {
		invoiceDao.addInvoice(invoice);

	}

	@Override
	@Transactional
	public void updateInvoice(Invoice invoice) {
		invoiceDao.updateInvoice(invoice);

	}

	@Override
	@Transactional
	public Invoice getInvoice(String id) {
		return invoiceDao.getInvoice(id);

	}

	@Override
	@Transactional
	public void deleteInvoice(String id) {
		invoiceDao.deleteInvoice(id);

	}


	@Override
	@Transactional
	public List<Invoice> getInvoices() {
	   return invoiceDao.getInvoices();
	}

	@Override
	public void calculateSubTotalandTotal(Invoice invoice) {
		invoice.setTotal(100.0);
		invoice.setSubtotal(50.0);
		
	}
	
	public void addJobToInvoice(Invoice invoice,Date dayWorked, String description, double timeInvolved ) {
		Job jobDone = new Job();
		
		jobDone.setDateCompleted(dayWorked);
		jobDone.setDescription(description);
		jobDone.setTime(timeInvolved);

		invoice.getJobDoneSet().add(jobDone);
		
		
	}

}
