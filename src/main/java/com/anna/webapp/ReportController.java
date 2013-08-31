package com.anna.webapp;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.anna.dao.InvoiceDao;
import com.anna.entity.Invoice;
import com.mysql.jdbc.Statement;
 
 
 
@Controller
@RequestMapping("/report/")
public class ReportController {
 
 
    private static final Logger logger = LoggerFactory.getLogger(InvoiceController.class);
 
    @Autowired
    InvoiceDao InvoiceDao;
    
 
    Connection connection;
    
    Statement statement;
    
    ResultSet resultSet;
    
//    String QUERY = " SELECT
//				     invoice.`id_invoice` AS invoice_id_invoice,
//				     invoice.`date` AS invoice_date,
//				     invoice.`company` AS invoice_company,
//				     invoice.`rate` AS invoice_rate,
//				     invoice.`typerate` AS invoice_typerate,
//				     invoice.`subtotal` AS invoice_subtotal,
//				     invoice.`gst` AS invoice_gst,
//				     invoice.`total` AS invoice_total,
//				     invoice.`payment_term` AS invoice_payment_term,
//				     invoice.`id_person` AS invoice_id_person,
//				     job.`id_job` AS job_id_job,
//				     job.`date_completed` AS job_date_completed,
//				     job.`description` AS job_description,
//				     job.`time_worked` AS job_time_worked,
//				     person.`id_person` AS person_id_person,
//				     person.`firstname` AS person_firstname,
//				     person.`lastname` AS person_lastname,
//				     person.`jobtitle` AS person_jobtitle,
//				     person.`address` AS person_address,
//				     person.`abn` AS person_abn,
//				     person.`mobile` AS person_mobile,
//				     person.`mail` AS person_mail,
//				     person.`bankname` AS person_bankname,
//				     person.`accountname` AS person_accountname,
//				     person.`bsb` AS person_bsb,
//				     person.`accountnumber` AS person_accountnumber,
//				     invoice_job.`id_invoice` AS invoice_job_id_invoice,
//				     invoice_job.`id_job` AS invoice_job_id_job
//				FROM
//				     `person` person INNER JOIN `invoice` invoice ON person.`id_person` = invoice.`id_person`
//				     INNER JOIN `invoice_job` invoice_job ON invoice.`id_invoice` = invoice_job.`id_invoice`
//				     INNER JOIN `job` job ON invoice_job.`id_job` = job.`id_job` where invoice.`id_invoice`='LAN008'" ;
//    
 
    @RequestMapping(method = RequestMethod.GET , value = "pdf")
    public ModelAndView generatePdfReport(ModelAndView modelAndView, String id_invoice){
 
        logger.debug("--------------generate PDF report----------");
 
       
        
        Map<String,Object> parameterMap = new HashMap<String,Object>();
           
        try {
        	Class.forName("com.mysql.jdbc.Driver");
        	connection = DriverManager.getConnection ("jdbc:mysql://localhost:3306/annamac?user=root&password=");
        	
        	
        	
			
		} catch (Exception e) {
			// TODO: handle exception
		}
        
        List<Invoice> usersList = null;
// 
//        JRDataSource JRdataSource = new JRBeanCollectionDataSource(usersList);
//        JasperPrint print = JasperFillManager.fillReport(report, parameters, conn);
//     parameterMap.put("datasource", JRdataSource);
 
        
        //pdfReport bean has ben declared in the jasper-views.xml file
        modelAndView = new ModelAndView("pdfReport", parameterMap);
 
        return modelAndView;
 
    }//generatePdfReport
 
 
 
    @RequestMapping(method = RequestMethod.GET , value = "xls")
    public ModelAndView generateXlsReport(ModelAndView modelAndView){
 
        logger.debug("--------------generate XLS report----------");
 
        Map<String,Object> parameterMap = new HashMap<String,Object>();
 
        List<Invoice> usersList = null;
 
        JRDataSource JRdataSource = new JRBeanCollectionDataSource(usersList);
 
        parameterMap.put("datasource", JRdataSource);
 
        //xlsReport bean has ben declared in the jasper-views.xml file
        modelAndView = new ModelAndView("xlsReport", parameterMap);
 
        return modelAndView;
 
    }//generatePdfReport
 
 
    @RequestMapping(method = RequestMethod.GET , value = "csv")
    public ModelAndView generateCsvReport(ModelAndView modelAndView){
 
        logger.debug("--------------generate CSV report----------");
 
        Map<String,Object> parameterMap = new HashMap<String,Object>();
 
       // List<User> usersList = userDao.retrieveAllRegisteredUsers();
        List<Invoice> usersList = null;

        
        
        JRDataSource JRdataSource = new JRBeanCollectionDataSource(usersList);
 
        parameterMap.put("datasource", JRdataSource);
 
        //xlsReport bean has ben declared in the jasper-views.xml file
        modelAndView = new ModelAndView("csvReport", parameterMap);
 
        return modelAndView;
 
    }//generatePdfReport
 
 
 
    @RequestMapping(method = RequestMethod.GET , value = "html")
    public ModelAndView generateHtmlReport(ModelAndView modelAndView){
 
        logger.debug("--------------generate HTML report----------");
 
        Map<String,Object> parameterMap = new HashMap<String,Object>();
 
       // List<User> usersList = invoiceDao.retrieveAllRegisteredUsers();
        List<User> usersList = null;
        JRDataSource JRdataSource = new JRBeanCollectionDataSource(usersList);
 
        parameterMap.put("datasource", JRdataSource);
 
        //xlsReport bean has ben declared in the jasper-views.xml file
        modelAndView = new ModelAndView("htmlReport", parameterMap);
 
        return modelAndView;
 
    }//generatePdfReport
 
 
}//ReportController