package com.javainuse.springMarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@ComponentScan(basePackages = "com.javainuse.springMarket")

@SpringBootApplication
public class SpringMarketApplication extends SpringBootServletInitializer {


	public static void main(String[] args) {
		SpringApplication.run(SpringMarketApplication.class, args);
	}

}
