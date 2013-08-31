package com.anna.service;

import java.util.Date;
import java.util.List;

import com.anna.entity.Invoice;

public interface InvoiceService {
	
   	public void addInvoice(Invoice invoice);
   	public void updateInvoice(Invoice invoice);
   	public Invoice getInvoice(String id);
   	public void deleteInvoice(String id);
   	public List<Invoice> getInvoices();
	public void calculateSubTotalandTotal(Invoice invoice);
	public void addJobToInvoice(Invoice invoice,Date dayWorked, String description, double timeInvolved );
	

}
