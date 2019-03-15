package com.example.Trader_simul.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Trader_simul.dao.ProductRepository;
import com.example.Trader_simul.model.Product;

@Service
public class Productservice {

	@Autowired
	private ProductRepository productRepository;
	
	public Product create(double price,int quantity) {
		return productRepository.save(new Product(price,quantity));
	}
	
	public List<Product>getAll(){
		return productRepository.findAll();
	}
	public Product getByprice(double price) {
		return productRepository.findByPrice( price);
	}
	public Product getByquantity(int quantity) {
		return productRepository.findByQuantity( quantity);
	}
	
	public Product update(double price,int quantity) {
		Product p = productRepository.findByPrice( price);
		p.setQuantity(quantity);
		return productRepository.save(p);
	}
}
