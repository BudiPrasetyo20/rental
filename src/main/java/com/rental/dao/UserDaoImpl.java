package com.rental.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rental.common.CommonDaoImpl;
import com.rental.model.User;

@Repository("userDao")
@Transactional
public class UserDaoImpl extends CommonDaoImpl<User> {

	
}
