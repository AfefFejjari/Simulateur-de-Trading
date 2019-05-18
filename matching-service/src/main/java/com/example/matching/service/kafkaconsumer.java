package com.example.matching.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.matching.model.Order;

public class kafkaconsumer {

	@Service
	public class KafkaConsumer {

	    @KafkaListener(topics = "order-command", groupId = "group_id")
	    public void consume(String message) {
	        System.out.println("Consumed message: " + message);
	    }


	    @KafkaListener(topics = "Kafka_Example_json", groupId = "group_json",
	            containerFactory = "userKafkaListenerFactory")
	    public void consumeJson(Order order) {
	        System.out.println("Consumed JSON Message: " + order);
	    }
	}
}
