package com.example.Trader_simul.dao;

//import java.util.Optional;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.Trader_simul.model.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, String>{
	
	//public Optional<Order> findById(String id);
	
}
