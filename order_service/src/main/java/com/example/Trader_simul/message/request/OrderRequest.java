package com.example.Trader_simul.message.request;

import java.math.BigDecimal;
import java.util.Optional;

import javax.validation.constraints.NotBlank;

import com.example.Trader_simul.model.Duration;
import com.example.Trader_simul.model.OrderType;
import com.example.Trader_simul.model.TransactionType;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class OrderRequest {
	
		private String contractSymbol;
	    private TransactionType transactionType;
	    @NotBlank
	    private int quantity;
	    private OrderType orderType;
	    private Optional<BigDecimal> limitPrice;
	    private Optional<BigDecimal> stopPrice;
	    private Duration duration;
	    private String userId;

}
