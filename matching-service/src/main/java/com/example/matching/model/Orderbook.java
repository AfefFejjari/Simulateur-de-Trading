package com.example.matching.model;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;



import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class Orderbook {
	
	 private Contract contract;
	private List<Order> orderlist;

	 public void sortOrders() {
	        Collections.sort(this.orderlist, new Comparator() {
	            public int compare(Object object1, Object object2) {

	                BigDecimal price1 = ((LimitOrder) object1).getLimitPrice();
	                BigDecimal price2 = ((LimitOrder) object2).getLimitPrice();
	                int comparator = ((LimitOrder) object1).getTransactionType() == TransactionType.SELL ?
	                        price1.compareTo(price2) : price2.compareTo(price1)  ;
	                if (comparator != 0) {
	                    return comparator;
	                }
	                ZonedDateTime timestamp1 =((LimitOrder) object1).getTime();
	                ZonedDateTime timestamp2 =((LimitOrder) object2).getTime();
	                return timestamp1.compareTo(timestamp2);
	            }
	        });
}
