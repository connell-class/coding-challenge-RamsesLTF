package com.codechallenge.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.codechallenge.model.GroceryItemModel;
import com.codechallenge.service.ItemListService;

@Controller
@RequestMapping(value = "/itemList")
@CrossOrigin(origins ="*")
public class itemListController {

	private ItemListService il;
	
	@GetMapping(value = "/getAll.app")
	public @ResponseBody List<GroceryItemModel> getAll() {
		System.out.println("inside get all controller");
		return il.getAllItems();
		
}
}
