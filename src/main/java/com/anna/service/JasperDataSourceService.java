package com.anna.service;

import java.util.ArrayList;
import java.util.List;
 
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
public class JasperDataSourceService {
 
//	@Autowired
//	private InvoiceDao invoiceDao;
//	
//	/**
//	 * Returns a data source that's wrapped within {@link JRDataSource}
//	 * @return
//	 */
//	public JRDataSource getDataSource() {
//		List<User> records = repository.findAll();
//		List<JasperDto> dtos = new ArrayList<JasperDto>();
//		
//		// Map records
//		for (User user: records) {
//			JasperDto dto = new JasperDto();
//			dto.setId(user.getId());
//			dto.setUsername(user.getUsername());
//			dto.setFirstName(user.getFirstName());
//			dto.setLastName(user.getLastName());
//			
//			if (user.getRole().getRole() == 1)
//				dto.setRole("Admin");
//			else
//				dto.setRole("Regular");
//			
//			dtos.add(dto);
//		}
//		// Return wrapped collection
//		return new JRBeanCollectionDataSource(dtos);
//	}
}