package com.example.Trader_simul.dao;
import org.springframework.stereotype.Repository;



import com.example.Trader_simul.model.Contract;

import org.springframework.data.mongodb.repository.MongoRepository;
@Repository
public interface ContractRepository extends MongoRepository<Contract, String>{
	public Contract findBySymbol(String symbol);
}



/*import com.example.Trader_simul.model.Product;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface ContractRepository extends CrudRepository<Product, String> {
   
	@Override
	
     Optional<Product> findById(String id);

    @Override
    void delete(Product deleted);
    public Product findByref(String ref);
    public Product findByPrice(double price);
    public Product findByQuantity(int quantity);
}
*/