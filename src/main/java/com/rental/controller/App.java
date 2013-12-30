package com.rental.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.rental.bo.UserBo;
import com.rental.model.User;


@Controller
@Scope("session")
public class App {

	@Autowired
	private UserBo<User> userBo;
	
	public String saveUser()throws ParseException{
		/** insert **/
    	User user = new User();
    	user.setName("Bo");
    	user.setAddress("address");
    	user.setId("4");
    	user.setPassword("password");
    	
    	userBo.save(user);
		
    	return "SAVE OKE";
	}
}
