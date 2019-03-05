package com.javainuse.springMarket.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.javainuse.springMarket.model.user;


@SpringBootApplication
@Controller
public class DashboardController {

    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public ModelAndView dashboard() {
    	ModelAndView model = new ModelAndView();
    	model.addObject("users", getUsers());
    	model.setViewName("dashboard");
    	return model;
    }

	private List<user> getUsers() {
		user user = new user();
		user.setEmail("afef@gmail.com");
		user.setName("afef");
		user.setAddress("tunisie, tunis");
		user user1 = new user();
		user1.setEmail("afef@gmail.com");
		user1.setName("afef");
		user1.setAddress("tunisie, tunis");
		return Arrays.asList(user, user1);
	}

}
