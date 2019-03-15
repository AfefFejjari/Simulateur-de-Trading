package com.example.Trader_simul.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Trader_simul.model.Product;
import com.example.Trader_simul.service.Productservice;

@RestController
public class Productcontroller {
	@Autowired
	private Productservice productservice;
	
	

	@RequestMapping("/create")
	public String create(@RequestParam double price,@RequestParam int quantity) {
		Product p = productservice.create(price,quantity);
		return p.toString();
	}
	
	
	@RequestMapping("/update")
	public String update(@RequestParam double price,@RequestParam int quantity) {
		Product p = productservice.update(price,quantity);
		return p.toString();
	}

	@RequestMapping("/get")
	public List<Product>getAll(){
		return productservice.getAll();
	
	}
	   @RequestMapping("delet")
	    public String delete(@RequestParam double price,@RequestParam int quantity) {
	        

	        return "";
	    }
}
