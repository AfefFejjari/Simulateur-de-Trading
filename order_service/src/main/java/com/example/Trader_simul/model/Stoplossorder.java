package com.example.Trader_simul.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

public class Stoplossorder extends Order{
	
	@Getter @Setter
    private BigDecimal stopPrice;
	
    public Stoplossorder(){
        this.ordertype = OrderType.STOP;
    }
}
