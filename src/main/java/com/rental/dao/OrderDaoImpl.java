package com.rental.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rental.common.CommonDaoImpl;
import com.rental.model.Order;

@Repository("orderDao")
@Transactional
public class OrderDaoImpl extends CommonDaoImpl<Order> {

	
}
