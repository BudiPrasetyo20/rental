package com.rental.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rental.common.CommonDao;
import com.rental.model.Setting;

@Repository("settingDao")
@Transactional
public class SettingDaoImpl extends CommonDao<Setting> {

	
}
