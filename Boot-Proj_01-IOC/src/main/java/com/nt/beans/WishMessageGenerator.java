package com.nt.beans;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired
	private Calendar cobj;
	int hours;
	public void displayMsg(String user) {
		hours = cobj.get(Calendar.HOUR_OF_DAY);
		if(hours < 12)
			System.out.println("Good Morning "+user);
		else if((hours > 12) && (hours < 15))
			System.out.println("Good afternoon "+user);
		else if((hours > 15) && (hours < 19))
			System.out.println("Good evening "+user);
		else
			System.out.println("Good night "+user);
	}
}
