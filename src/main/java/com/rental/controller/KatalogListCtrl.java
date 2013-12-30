package com.rental.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.rental.model.User;

@Controller
@Scope("session")
public class KatalogListCtrl implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String searchBy;
	private String keyWord;
	private String status;
	List<SelectItem> searchByList = new ArrayList<SelectItem>();
	private List<User> listOf = new ArrayList<>();
	
	@PostConstruct
	private void init() throws Exception {
		searchByList.clear();
		searchByList.add(new SelectItem("",""));
		searchByList.add(new SelectItem("judulFilm","Judul Film"));
		searchByList.add(new SelectItem("tahunKeluar","Tahun Keluar"));
		searchByList.add(new SelectItem("sutradara","Sutradara"));
		searchByList.add(new SelectItem("bintangFilm","Bintang Film"));
	}
	
	public void doSearch() throws Exception{

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
