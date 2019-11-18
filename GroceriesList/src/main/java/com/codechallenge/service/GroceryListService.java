package com.codechallenge.service;

import java.util.List;

import com.codechallenge.dao.GroceryListDao;
import com.codechallenge.model.GroceryListModel;

public class GroceryListService {

private GroceryListDao gl;
	
	public List<GroceryListModel> getAll(){
		System.out.println("inside getAll service");
		return gl.getAll();
	}
	
	
	
	public void update(GroceryListModel p) {
		gl.update(p, null);
	}

	
}
