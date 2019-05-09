package com.example.matching.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.matching.service.MatcherTradeEventservice;
import com.example.matching.model.Orderbook;

public class MatchingController {
	
	 @Autowired 
	  
	 private MatcherTradeEventservice matchingService;

	 public void addOrderBook(int symbol) {
	        orderBook = IOrderBook.newInstance();
	    }

	    public OrderBook getOrderBook(){
	        return orderBook;
	    }
	    public void reset() {
	        orderBook.clear();
	    }
}
