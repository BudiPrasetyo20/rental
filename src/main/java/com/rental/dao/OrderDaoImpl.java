package com.rental.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rental.common.CommonDao;
import com.rental.model.Order;

@Repository("orderDao")
@Transactional
public class OrderDaoImpl extends CommonDao<Order> {

	
}
