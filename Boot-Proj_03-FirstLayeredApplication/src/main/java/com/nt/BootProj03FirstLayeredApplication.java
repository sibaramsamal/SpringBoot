package com.nt;

import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.beans.CustomerBean;
import com.nt.controller.CustomerController;

@SpringBootApplication
public class BootProj03FirstLayeredApplication {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj03FirstLayeredApplication.class, args);
		CustomerController ctrl = ctx.getBean("controller",CustomerController.class);
		while(true) {
			System.out.println("1. For savedetails\n2. For show details\n3. Exit");
			System.out.println("Enter your choice:");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the customer details.");
				System.out.println("Enter the name:");	// < some name + '\n' >
				String name = sc.next(); 
				System.out.println("Enter address:");
				String address = sc.next();
				
				System.out.println("Enter the amount:");
				float amount = sc.nextFloat();
				System.out.println("Enter time period:");
				float time = sc.nextFloat();
				System.out.println("Enter rate of interest:");
				float rate = sc.nextFloat();
				CustomerBean bean = new CustomerBean();
				
				bean.setCname(name);
				bean.setAddress(address);
				bean.setAmount(amount);
				bean.setTime(time);
				bean.setRate(rate);
				try {
					ctrl.saveData(bean);
				}catch(Exception e) {
					e.printStackTrace();
				}
				break;
			
			case 2:
				try {
					ctrl.showData();;
				}catch(Exception e) {
					e.printStackTrace();
				}
				break;
			
			case 3:
				System.exit(1);
			}
		}
	}
}
