package com.rental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.rental.facade.interfaces.IUserFacade;
import com.rental.model.User;


@Controller
@Scope("session")
public class App {

	@Autowired
	private IUserFacade<User> userFacade;
	
	public String saveUser()throws Exception{
		/** insert **/
    	User user = new User();
    	user.setName("Bo");
    	user.setAddress("address");
    	user.setId("22");
    	user.setPassword("password");
    	
    	userFacade.save(user);
		
    	return "SAVE OKE";
	}
}
