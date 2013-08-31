package com.anna.dao;

import java.sql.Connection;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.anna.entity.Invoice;

@Repository
@Transactional
public class InvoiceDaoImpl extends AbstractHibernateDAO<Invoice> implements InvoiceDao  {
 

	@Override
	public void addInvoice(Invoice invoice) {
		getCurrentSession().save(invoice);

	}
	


	@Override
	public void updateInvoice(Invoice invoice) {
		Invoice invoiceToUpdate = getInvoice(invoice.getId());
	    
		
		invoiceToUpdate.setCompany(invoice.getCompany());
		invoiceToUpdate.setDate(invoice.getDate());
		invoiceToUpdate.setGst(invoice.getGst());
		invoiceToUpdate.setJobDoneSet(invoice.getJobDoneSet());
		invoiceToUpdate.setPaymentTerm(invoice.getPaymentTerm());
		invoiceToUpdate.setPerson(invoice.getPerson());
		invoiceToUpdate.setPaymentTerm(invoice.getPaymentTerm());
		invoiceToUpdate.setRate(invoice.getRate());
		invoiceToUpdate.setTypeRate(invoice.getTypeRate());
		invoiceToUpdate.setSubtotal(invoice.getSubtotal());
		invoiceToUpdate.setTotal(invoice.getTotal());

		getCurrentSession().update(invoice);

	}

	@Override
	public Invoice getInvoice(String id) {	
		Invoice invoice = (Invoice) getCurrentSession().get(Invoice.class, id);
        
		return invoice;

	}

	@Override
	public void deleteInvoice(String id) {
		Invoice invoiceToDelete = getInvoice(id);
	  if (invoiceToDelete != null)
		getCurrentSession().delete(invoiceToDelete);

	}


	@Override
	public List<Invoice> getInvoices() {
		 return getCurrentSession().createQuery("from Invoice").list();

	}

	

}
