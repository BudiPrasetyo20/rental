package com.rental.common;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class CommonDaoImpl<T> implements CommonDao<T> {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getActiveSession() {
		return sessionFactory.getCurrentSession();
	}

	public void save(T entity) {
		Session session = getActiveSession();
		Transaction transaction = session.beginTransaction();
		session.save(entity);
		transaction.commit();
	}

	public void update(T entity) {
		Session session = getActiveSession();
		Transaction transaction = session.beginTransaction();
		session.update(entity);
		transaction.commit();
	}

	public void delete(T entity) {
		Session session = getActiveSession();
		Transaction transaction = session.beginTransaction();
		session.delete(entity);
		transaction.commit();
	}

	public void findBykey(Object object) {

	}
	
	public List<T> find(DetachedCriteria detachedCriteria) throws Exception {
		return find(detachedCriteria);
	}

}
