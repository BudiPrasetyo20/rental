package com.rental.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rental.common.CommonDaoImpl;
import com.rental.model.Film;

@Repository("filmDao")
@Transactional
public class FilmDaoImpl extends CommonDaoImpl<Film> {

	
}
