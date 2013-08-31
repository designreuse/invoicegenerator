package com.anna.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.anna.entity.Person;

@Repository
@Transactional
public class PersonDaoImpl extends AbstractHibernateDAO<Person>  implements PersonDao  {


	@Override
	public void addPerson(Person Person) {
		getCurrentSession().save(Person);

	} 

	@Override
	public void updatePerson(Person person) {
		Person personToUpdate = getPerson(person.getId());
		personToUpdate.setAbn(person.getAbn());
		personToUpdate.setAccountName(person.getAccountName());
		personToUpdate.setAccountNumber(person.getAccountNumber());
		getCurrentSession().update(personToUpdate);

	}

	@Override
	@Transactional
	public Person getPerson(int id) {	
		Person person = (Person) getCurrentSession().get(Person.class, id);
        
		return person;

	}

	@Override
	public void deletePerson(int id) {
		Person personToDelete = getPerson(id);
	  if (personToDelete != null)
		getCurrentSession().delete(personToDelete);

	}


	@Override
	public List<Person> getPeople() {
		 return getCurrentSession().createQuery("from Person").list();

	}



}
