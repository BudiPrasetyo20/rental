package com.rental.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rental.common.CommonDaoImpl;
import com.rental.model.OrderDetail;

@Repository("orderDetailDao")
@Transactional
public class OrderDetailDaoImpl extends CommonDaoImpl<OrderDetail> {

	
}
