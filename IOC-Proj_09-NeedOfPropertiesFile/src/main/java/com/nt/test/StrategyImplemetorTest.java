package com.nt.test;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.Vehicle;
import com.nt.cfgs.MyConfigurationClass;

public class StrategyImplemetorTest {
	public static void main(String[] args) {
		Vehicle vcl;
		Scanner sc = new Scanner(System.in);
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfigurationClass.class);
		
		System.out.println("Enter the starting and destination point: ");
		String startPoint = sc.nextLine();
		String endPoint = sc.nextLine();
		vcl = ctx.getBean("vehicle",Vehicle.class);
		vcl.getJourneyStatus(startPoint, endPoint);
	}
}
