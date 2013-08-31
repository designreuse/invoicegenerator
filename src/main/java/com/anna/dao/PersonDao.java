package com.anna.dao;

import java.util.List;


import org.springframework.transaction.annotation.Transactional;

import com.anna.entity.Person;
@Transactional
public interface PersonDao {
   	public void addPerson(Person person);
   	public void updatePerson(Person person);
   	public Person getPerson(int id);
   	public void deletePerson(int id);
   	public List<Person> getPeople();
   	
	

}
