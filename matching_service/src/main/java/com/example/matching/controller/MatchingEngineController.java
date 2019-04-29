package com.example.matching.controller;

import org.springframework.beans.factory.annotation.Autowired;

import  com.example.matching.service.Matchingservice;

public class MatchingEngineController {
	
	 @Autowired // TODO better service name?
	  
	 private Matchingservice matchingService;

	 public void addOrderBook(int symbol) {
	        orderBook = IOrderBook.newInstance();
	    }

	    public IOrderBook getOrderBook(){
	        return orderBook;
	    }
	    public void reset() {
	        orderBook.clear();
	    }
}
