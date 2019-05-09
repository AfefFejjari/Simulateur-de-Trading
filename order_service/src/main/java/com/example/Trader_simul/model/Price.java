package com.example.Trader_simul.model;

//import java.math.BigDecimal;

public class Price {
	
	double lastprice;
    double bid;
	double ask;

	protected Price() {}
	
	public Price(double lastprice,double bid,double ask) {
		this.lastprice=lastprice;
		this.bid=bid;
		this.ask=ask;
		
	}
	public double getLastprice() {
	    return lastprice;
	}

	public void setLastprice(double lastprice) {
	    this.lastprice = lastprice;
	}
	public double getBid() {
	    return bid;
	}

	public void setBid(double bid) {
	    this.bid = bid;
	}
	public double getAsk() {
	    return ask;
	}

	public void setAsk(double ask) {
	    this.ask = ask;
	}
}
