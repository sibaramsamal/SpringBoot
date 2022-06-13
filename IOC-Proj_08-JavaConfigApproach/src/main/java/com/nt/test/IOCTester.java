package com.nt.test;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.WishMessageGenerator;
import com.nt.cfgs.AppConfig;

public class IOCTester {
	public static void main(String[] args) {
		//below line will create IOC container object
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		WishMessageGenerator generator = ctx.getBean("wmg",WishMessageGenerator.class);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String uname = sc.nextLine();
		generator.displayMsg(uname);
	}
}


