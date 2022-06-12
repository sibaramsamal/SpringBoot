package com.nt.tests;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.Controller;
import com.nt.vo.CustomerVO;

public class RealTimeDITester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Name:");
		String name = sc.nextLine();
		System.out.println("Enter address:");
		String addr = sc.nextLine();
		System.out.println("Enter Amount:");
		String amt = sc.next();
		System.out.println("Enter Duration:");
		String time = sc.next();
		System.out.println("Enter rate of interest: ");
		String rate = sc.next();
		
		CustomerVO vo = new CustomerVO();
		vo.setCname(name);
		vo.setCaddr(addr);
		vo.setAmount(amt);
		vo.setDuration(time);
		vo.setRate(rate);
		
		
		// Three IOC container creation steps
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/ApplicationContext.xml");
		
		//getting the desired bean by id
		Controller c = factory.getBean("custController",Controller.class);
		
		//invoking B. Logic
		try {
			System.out.println(c.getInterest(vo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
