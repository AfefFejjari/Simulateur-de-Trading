package com.example.matching.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

public class Limitorder extends Order {
@Getter @Setter
	 private BigDecimal limitPrice;

	 public Limitorder(){
	     this.ordertype = OrderType.LIMIT;
	 }


}
