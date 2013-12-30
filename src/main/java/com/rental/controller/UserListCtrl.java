package com.rental.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.rental.facade.UserFacade;
import com.rental.model.User;

@Controller
@Scope("session")
public class UserListCtrl implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Autowired
	UserFacade userBoImpl;
	
	private String searchBy;
	private String keyWord;
	private String status;
	List<SelectItem> searchByList = new ArrayList<SelectItem>();
	private List<User> listOf = new ArrayList<>();
	
	@PostConstruct
	private void init() throws Exception {
		searchByList.clear();
		searchByList.add(new SelectItem("",""));
		searchByList.add(new SelectItem("name","Nama User"));
		searchByList.add(new SelectItem("id","Id User"));
		searchByList.add(new SelectItem("address","Alamat"));
	}
	
	public void doSearch() throws Exception{
		System.out.println(searchBy);
		System.out.println(keyWord);
		System.out.println(status);
		
		listOf = userBoImpl.findValueFilter(searchBy, keyWord, status);
		
	}

	//set n get
	public List<User> getListOf() {
		return listOf;
	}

	public void setListOf(List<User> listOf) {
		this.listOf = listOf;
	}

	public String getSearchBy() {
		return searchBy;
	}

	public void setSearchBy(String searchBy) {
		this.searchBy = searchBy;
	}

	public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<SelectItem> getSearchByList() {
		return searchByList;
	}

	public void setSearchByList(List<SelectItem> searchByList) {
		this.searchByList = searchByList;
	}
	
}
