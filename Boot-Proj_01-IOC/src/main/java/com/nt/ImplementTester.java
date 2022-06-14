package com.nt;

import java.util.Calendar;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.beans.WishMessageGenerator;

@SpringBootApplication
public class ImplementTester {
	@Bean("cal")
	public Calendar getCalendar() {
		return Calendar.getInstance();
	}
	public static void main(String[] args) throws Exception { 
		
		Scanner sc = new Scanner(System.in);
		String uname;
		
		ApplicationContext ctx = SpringApplication.run(ImplementTester.class, args);
		System.out.println("Enter your name: ");
		uname = sc.nextLine();
		WishMessageGenerator msg = ctx.getBean("wmg",WishMessageGenerator.class);
		msg.displayMsg(uname);
	}
}
