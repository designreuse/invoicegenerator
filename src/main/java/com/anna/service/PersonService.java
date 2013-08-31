package com.anna.service;

import java.util.List;

import com.anna.entity.Person;

public interface PersonService {
	
 	public void addPerson(Person person);
   	public void updatePerson(Person person);
   	public Person getPerson(int id);
   	public void deletePerson(int id);
   	public List<Person> getPeople();
   	public Person getAnna();

}
