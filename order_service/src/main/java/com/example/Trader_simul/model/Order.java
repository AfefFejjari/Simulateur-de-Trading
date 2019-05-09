package com.example.Trader_simul.model;

import java.time.LocalDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
	@Document(collection = "order")
	public class Order {
		
	@Id
	@Field("_id")
	private ObjectId id;
	
	@Indexed(unique = true, direction = IndexDirection.DESCENDING)
	private String contractsymbol;
    private int quantity;
	private TransactionType transactiontype;
	protected OrderType ordertype; 
	private Duration duration;
	private State state;
	private LocalDateTime date;


}
