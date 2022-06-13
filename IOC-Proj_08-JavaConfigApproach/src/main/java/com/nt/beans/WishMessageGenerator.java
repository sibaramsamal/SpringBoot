package com.nt.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired
	private LocalDateTime dt;
	public void displayMsg(String user) {
		int hours = dt.getHour();
		if(hours < 12)
			System.out.println("Good Morning"+user);
		if((hours > 12) && (hours < 15))
			System.out.println("Good afternoon"+user);
		if(hours > 15)
			System.out.println("Good evng "+user);
		else
			System.out.println("Good night");
	}
}
/*
	This is a user defined class, so we have used sterio type annotatons with it.
	We won't find any object creation logic for this class inside our java configuration class
	because, at the time it gone through the steriotype annotation, it will go to the base package
	and if found such class annotated with steriotype, it'll directly create object for that class

*/