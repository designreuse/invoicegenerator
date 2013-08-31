package com.anna.service;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.anna.entity.Data;
import com.anna.entity.JqGridData;
import com.anna.entity.Person;
import com.anna.entity.Person1;

@Controller
public class JsonGridService {

  private Data data = new Data();
  
  @RequestMapping(value =  {"/grid/data/1"}, method = RequestMethod.GET)
  @ResponseBody
  public JqGridData getPeopleAtPostcode(@PathVariable String postcode){

    if(postcode == null || postcode.trim().length() == 0) postcode = "BS21 7RH";

    List<Person1> personList = data.getData(postcode);

    int totalNumberOfPages = 1;
    int currentPageNumber = 1;
    int totalNumberOfRecords = 8; // All in there are 8 records in our dummy data object

   // JqGridData<Person1> gridData = new JqGridData<Person>(totalNumberOfPages, currentPageNumber, totalNumberOfRecords, personList);

    //return gridData;
    
    return null;
  }
}