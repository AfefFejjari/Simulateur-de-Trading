package com.example.Trader_simul.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product")
public class Product {
	
@Id
String id;
double price;
int quantity;
public Product(double price, int quantity) {
	super();
	this.price = price;
	this.quantity = quantity;
}
public String getId() {
    return id;
}

public void setId(String id) {
    this.id = id;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String toString() {
	return "Product price:"+price+"Product quantity:"+quantity;
}



}
