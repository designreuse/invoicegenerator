package com.anna.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data {
  private static Map<String, List<Person1>> data = new HashMap<String, List<Person1>>();

  static{
    populateBS217RHData();
    populateBS18QTData();
  }

  public List<Person1> getData(String postcode){
    return data.get(postcode.toUpperCase());
  }

  private static void populateBS217RHData(){
    List<Person1> Person1List = new ArrayList<Person1>();

    Person1List.add(new Person1("Adam", "Davies", "18 Knowles Road Clevedon"));
    Person1List.add(new Person1("David", "Smith", "185 Old Kent Road, Clevedon"));
    Person1List.add(new Person1("Jane", "Adams", "216 Park Road, Clevedon"));
    Person1List.add(new Person1("Sue", "Green", "207 Old Stree, Clevedon"));

    data.put("BS21 7RH", Person1List);
  }

  private static void populateBS18QTData(){
    List<Person1> Person1List = new ArrayList<Person1>();

    Person1List.add(new Person1("Sarah", "Jones", "1354 Ashley Road, Bristol"));
    Person1List.add(new Person1("Jayne", "Peters", "254 ALma Vale Road, Bristol"));
    Person1List.add(new Person1("Peter", "Richards", "Flat 4, 567 Clifton Road, Bristol"));
    Person1List.add(new Person1("Andrew", "Love", "324 Regent Street, Bristol"));

    data.put("BS1 8QT", Person1List);
  }
}