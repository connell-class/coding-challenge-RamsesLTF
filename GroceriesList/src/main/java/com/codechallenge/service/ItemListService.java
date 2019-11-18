package com.codechallenge.service;

import java.util.List;

import com.codechallenge.dao.GroceryItemsDao;
import com.codechallenge.model.GroceryItemModel;

public class ItemListService {

	private GroceryItemsDao gi;
	
	
	
	public List<GroceryItemModel> getAllItems(){
		
		return gi.getAll();
	}
	
}
