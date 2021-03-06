package com.rental.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.rental.facade.interfaces.IUserFacade;
import com.rental.model.User;

@Controller
@Scope("session")
public class UserFormCtrl implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Autowired
	private IUserFacade userBo;
	
	User user = new User();

	
	
	
	
	
	
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
