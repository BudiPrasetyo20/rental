package com.rental.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rental.common.CommonDaoImpl;
import com.rental.model.FilmItem;

@Repository("filmItemDao")
@Transactional
public class FilmItemDaoImpl extends CommonDaoImpl<FilmItem> {

	
}
