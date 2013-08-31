package com.anna.dao;

import java.io.Serializable;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

	@Repository
	@Transactional
	public abstract class AbstractHibernateDAO<T> {
	 
		@Inject
		private SessionFactory sessionFactory;

		protected Session getCurrentSession() {
	        return sessionFactory.getCurrentSession();
	     }
		
		

		
		public SessionFactory getSessionFactory() {
			return sessionFactory;
		}




		public void setSessionFactory(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}
		
		
		
		
//	    private final Class< T> clazz;
//	    @Autowired
//	    SessionFactory sessionFactory;
//	 
//	    public AbstractHibernateDAO(final Class< T> clazzToSet) {
//	        this.clazz = clazzToSet;
//	    }
//	 
//	    public T getById(final Long id) {
//	        //Preconditions.checkArgument(id != null);
//	        return (T) this.getCurrentSession().get(this.clazz, id);
//	    }
//	 
//	    public List< T> getAll() {
//	        return this.getCurrentSession()
//	                .createQuery("from " + this.clazz.getName()).list();
//	    }
//	 
//	    public void create(final T entity) {
//	       // Preconditions.checkNotNull(entity);
//	        this.getCurrentSession().persist(entity);
//	    }
//	 
//	    public void update(final T entity) {
//	        //Preconditions.checkNotNull(entity);
//	        this.getCurrentSession().merge(entity);
//	    }
//	 
//	    public void delete(final T entity) {
//	       // Preconditions.checkNotNull(entity);
//	        this.getCurrentSession().delete(entity);
//	    }
//	 
//	    public void deleteById(final Long entityId) {
//	        final T entity = this.getById(entityId);
//	       // Preconditions.checkState(entity != null);
//	        this.delete(entity);
//	    }
//	 
//	    public void setSessionFactory(SessionFactory sessionFactory) {
//	        this.sessionFactory = sessionFactory;
//	    }
//	 
//	    protected final Session getCurrentSession() {
//	        return this.sessionFactory.getCurrentSession();
//	    }

}
