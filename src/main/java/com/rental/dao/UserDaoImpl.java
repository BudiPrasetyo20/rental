package com.rental.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rental.common.CommonDao;
import com.rental.model.User;

@Repository("userDao")
@Transactional
public class UserDaoImpl extends CommonDao<User> {

	
}
