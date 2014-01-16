package com.rental.facade;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rental.common.CommonDao;
import com.rental.facade.interfaces.IUserFacade;
import com.rental.model.User;

@Service
public class UserFacade implements IUserFacade<User>{
	
	@Autowired
	private CommonDao<User> commonDao;

	@Override
	public void save(User entity) {
		commonDao.save(entity);
	}

	@Override
	public void update(User entity) {
		commonDao.update(entity);
	}

	@Override
	public void delete(User entity) {
		commonDao.delete(entity);
	}

	@Override
	public void findBykey(Object object) {
		commonDao.findBykey(object);
	}
	
	@Override
	public List<User> find(DetachedCriteria detachedCriteria) throws Exception {
		return find(detachedCriteria);
	}
	
	public List<User> findValueFilter(String searchBy, String keyWord, String status) throws Exception {
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(User.class)
				.add(Restrictions.and(
						Restrictions.like(searchBy, "%"+keyWord+"%"),
						Restrictions.eq("userStatus", status)));
		return commonDao.find(detachedCriteria);
	}

	

}
