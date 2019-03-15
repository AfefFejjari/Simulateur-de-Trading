package com.example.Trader_simul.dao;




import org.springframework.stereotype.Repository;


import com.example.Trader_simul.model.Product;

import org.springframework.data.mongodb.repository.MongoRepository;
@Repository
public interface ProductRepository extends MongoRepository<Product, String>{
     public Product findByPrice(double price);
     public Product findByQuantity(int quantity);
}

