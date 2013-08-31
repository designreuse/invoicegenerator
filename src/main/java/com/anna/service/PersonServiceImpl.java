package com.anna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anna.dao.PersonDao;
import com.anna.entity.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonDao personDao;
	
	@Override
	@Transactional
	public void addPerson(Person person) {
		personDao.addPerson(person);

	}

	@Override
	@Transactional
	public void updatePerson(Person person) {
		personDao.updatePerson(person);

	}

	@Override
	@Transactional
	public Person getPerson(int id) {
		return personDao.getPerson(id);

	}

	@Override
	@Transactional
	public void deletePerson(int id) {
		personDao.deletePerson(id);

	}


	@Override
	@Transactional
	public List<Person> getPeople() {
	   return personDao.getPeople();
	}


	@Override
	@Transactional
	public Person getAnna() {
		return personDao.getPerson(1);
	}

}
