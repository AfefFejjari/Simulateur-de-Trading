package com.example.matching.service;

import com.example.matching.model.BidAskbacket;
import com.example.matching.model.CommandResultCode;
import com.example.matching.model.Order;
import com.example.matching.model.Orderbook;
import com.example.matching.model.OrderCommand;
import com.example.matching.model.OrderCommandType;
import com.example.matching.model.OrderType;
import com.example.matching.model.TransactionType;

public class MatcherTradeEventservice {
	
	public  BidAskbacket buildaskbacket(Order order) {
		BidAskbacket asckbacket = new BidAskbacket(0, 0);
		
		
	}
	 public static OrderCommand limitOrder(long orderId, int uid, long price, long quantity, TransactionType action) {
	        OrderCommand cmd = new OrderCommand();
	        cmd.command = OrderCommandType.PLACE_ORDER;
	        cmd.orderId = orderId;
	        cmd.uid = uid;
	        cmd.price = price;
	        cmd.quantity = quantity;
	        cmd.action = action;
	        cmd.orderType = OrderType.LIMIT;
	        return cmd;
	    }
	public static OrderCommand marketOrder(long orderId, int uid, long quantity, TransactionType action) {
        OrderCommand cmd = new OrderCommand();
        cmd.command = OrderCommandType.PLACE_ORDER;
        cmd.orderId = orderId;
        cmd.uid = uid;
        cmd.price = 0;
        cmd.quantity = quantity;
        cmd.action = action;
        cmd.orderType = OrderType.MARKET;
        
        return cmd;
    }
	
}
