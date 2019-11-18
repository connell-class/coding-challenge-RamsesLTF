package com.codechallenge.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.codechallenge.model.GroceryItemModel;
import com.codechallenge.model.GroceryListModel;

public class GroceryListDao implements Dao<GroceryListModel> {
	
	
	static {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private List <GroceryListModel> groceries = new ArrayList<>();
	
	@Override
	public Optional<GroceryListModel> get(long id) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<GroceryListModel> getAll() {
		// TODO Auto-generated method stub
		return groceries;
	}

	@Override
	public void save(GroceryListModel grocery) {
		// TODO Auto-generated method stub
		groceries.add(grocery);
	}

	@Override
	public void update(GroceryListModel grocery, String[] params) {
		// TODO Auto-generated method stub
		groceries.add( grocery);
		
	}

	@Override
	public void delete(GroceryListModel grocery) {
		// TODO Auto-generated method stub
		groceries.remove(grocery);
	}

	@Override
	public void create(GroceryListModel t) {
		// TODO Auto-generated method stub
		
	}


}
