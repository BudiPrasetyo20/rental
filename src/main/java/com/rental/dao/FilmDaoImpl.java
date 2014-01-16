package com.rental.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rental.common.CommonDao;
import com.rental.model.Film;

@Repository("filmDao")
@Transactional
public class FilmDaoImpl extends CommonDao<Film> {

	
}
