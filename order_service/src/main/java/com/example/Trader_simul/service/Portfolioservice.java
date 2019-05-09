package com.example.Trader_simul.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.Trader_simul.dao.ContractRepository;
import com.example.Trader_simul.dao.OrderRepository;
import com.example.Trader_simul.message.request.OrderRequest;
import com.example.Trader_simul.model.Contract;
import com.example.Trader_simul.model.Limitorder;

import com.example.Trader_simul.model.Stoplossorder;
import com.example.Trader_simul.model.Order;

@Service
public class Portfolioservice {

	@Autowired
	private ContractRepository contractRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
    private KafkaTemplate<String, Order> kafkaTemplate;
	
	private static final String TOPIC = "Order-command";
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Portfolioservice.class);
	
	 public List<Contract> getContracts(){
	       return( contractRepository.findAll());
	    }
	 public void createMarketOrder(OrderRequest orderRequest, Order order) {
	        //Contract contract = contractRepository.findBySymbol(orderRequest.getContractSymbol());
	       
	        order.setContractsymbol(orderRequest.getContractSymbol());
	        order.setTransactiontype(orderRequest.getTransactionType());
	        order.setQuantity(orderRequest.getQuantity());
	        order.setDuration(orderRequest.getDuration());
	        order.setDate(LocalDateTime.now());
	        LOGGER.info(new Date().toString());
	    }
	public Order createOrder(OrderRequest orderRequest){
		 kafkaTemplate.send(TOPIC, new Order());
        switch(orderRequest.getOrderType()){

            case LIMIT:
                Limitorder limitOrder = new Limitorder();
                createMarketOrder(orderRequest,limitOrder);
                limitOrder.setLimitPrice(orderRequest.getLimitPrice().orElse(new BigDecimal(0)));
                orderRepository.save(limitOrder);
                kafkaTemplate.send(TOPIC, limitOrder);
                return limitOrder;
            case STOP:
                Stoplossorder stopLossOrder =new Stoplossorder();
                createMarketOrder(orderRequest,stopLossOrder);
                stopLossOrder.setStopPrice(orderRequest.getStopPrice().orElse(new BigDecimal(0)));
                orderRepository.save(stopLossOrder);
                kafkaTemplate.send(TOPIC, stopLossOrder);
                return stopLossOrder;

            default:
                Order marketOrder = new Order();
                createMarketOrder(orderRequest,marketOrder);
                orderRepository.save(marketOrder);
                kafkaTemplate.send(TOPIC, marketOrder);
                return marketOrder;

        }

    }

    public List<Order> getOrders(){
        return(orderRepository.findAll());
    }
	
}
