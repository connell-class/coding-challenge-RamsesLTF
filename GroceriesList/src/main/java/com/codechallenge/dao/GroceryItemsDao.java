package com.codechallenge.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.codechallenge.model.GroceryItemModel;

public class GroceryItemsDao  implements Dao<GroceryItemModel>{
	
	static {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private List<GroceryItemModel> items = new ArrayList<>();

	
	@Override
	public Optional<GroceryItemModel> get(long id) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<GroceryItemModel> getAll() {
		// TODO Auto-generated method stub
		return items;
	}

	@Override
	public void save(GroceryItemModel item) {
		// TODO Auto-generated method stub
		items.add(item);
	}

	@Override
	public void update(GroceryItemModel item, String[] params) {
		// TODO Auto-generated method stub
		items.add((GroceryItemModel) item);
		
	}

	@Override
	public void delete(GroceryItemModel item) {
		// TODO Auto-generated method stub
		items.remove(item);
	}

	@Override
	public void create(GroceryItemModel t) {
		// TODO Auto-generated method stub
		
	}

	


	
}

	