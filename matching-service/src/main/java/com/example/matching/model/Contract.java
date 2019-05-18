package com.example.matching.model;


import java.util.ArrayList;
import java.util.List;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;



	@Document(collection = "Contract")
	public class Contract {
		
	@Id
	@Field("_id")
	private String id;
	
	@Indexed(unique = true, direction = IndexDirection.DESCENDING)
    private String symbol;
	private List<Price> pricelist;
	
	protected Contract() {this.pricelist=new ArrayList<>();}
	
	
	
	public  Contract(String symbol,List<Price> pricelist) {
		
		this.symbol = symbol;
		this.pricelist = pricelist;
		
		
	}
	public String getId() {
	    return id;
	}

	public void setId( String id) {
	    this.id = id;
	}
	public String getSymbol() {
	    return symbol;
	}

	public void setSymbol(String symbol) {
	    this.symbol = symbol;
	}
	public List<Price> getPrice() {
		return pricelist;
	}
	
     public void setPrice(List<Price> pricelist) {
	  this.pricelist = pricelist;
		
     }  



	
}