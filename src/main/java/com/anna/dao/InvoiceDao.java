package com.anna.dao;

import java.sql.Connection;
import java.util.List;

import com.anna.entity.Invoice;

public interface InvoiceDao {
   	public void addInvoice(Invoice invoice);
   	public void updateInvoice(Invoice invoice);
   	public Invoice getInvoice(String id);
   	public void deleteInvoice(String id);
   	public List<Invoice> getInvoices();


}
