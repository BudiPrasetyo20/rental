package com.rental.bo;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

public interface UserBo<T> {
	
	public void save(T entity);
	public void update(T entity);
	public void delete(T entity);
	public void findBykey(Object object);
	public List<T> find(DetachedCriteria detachedCriteria) throws Exception;

}
