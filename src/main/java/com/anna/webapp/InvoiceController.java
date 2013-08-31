package com.anna.webapp;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;

import com.anna.entity.Invoice;
import com.anna.entity.Person;
import com.anna.service.InvoiceService;
import com.anna.service.PersonService;




@Controller
public class InvoiceController {
	
	@Inject
	private Invoice invoice;
	@Inject
	private Person person;

	@Inject
	private InvoiceService invoiceService;
	
	@Inject 
	private PersonService personService;

	
	
	

	@RequestMapping(value =  {"/invoice"}, method = RequestMethod.GET)
	public String invoice(Model model){
		
		return "invoice";		
	}
	
	@RequestMapping(value =  {"/createInvoice"}, method = RequestMethod.GET)
	public String createInvoice(Model model, String date,  String id, String company, double rate, String typeRate,
			                    int paymentTerm, @RequestParam(value="daysCompleted[]") String[] daysCompleted, 
			                    @RequestParam(value="description[]") String[] description,
			                    @RequestParam(value="quantityTime[]") double[] quantityTime){
		
		DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
		
		invoice.reset();
		
		try {
		invoice.setPerson(personService.getAnna());
		invoice.setId(id);
		invoice.setDate(df.parse(date));
		invoice.setCompany(company);
		invoice.setRate(rate);
		invoice.setPaymentTerm(paymentTerm);
		invoice.setTypeRate(typeRate);
        invoice.setGst(10.0);
		
		for (int i = 0; i < daysCompleted.length; i++) {
			invoiceService.addJobToInvoice(invoice, df.parse(daysCompleted[i]), description[i], quantityTime[i]);
		}
		
		
		invoiceService.calculateSubTotalandTotal(invoice);
		
	    invoiceService.addInvoice(invoice);
		
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		return "home";		
	}



	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public void setPerson(Person person) {
		this.person = person;
	}


	
	
	
	
	
	
	
	

}
