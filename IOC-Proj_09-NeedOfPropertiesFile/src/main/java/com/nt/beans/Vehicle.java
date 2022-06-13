package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	
	@Autowired
	
	//@Qualifier("gas")   //Here we give priority to GasEngine (using it's id), to be inject to this field
	private Engine eng;
	
	public void getJourneyStatus(String startPoint, String destinationPoint) {
		eng.startEngine();
		System.out.println("Journey started from: "+startPoint);
		System.out.println("Journey continues...");
		System.out.println("reached at: "+destinationPoint);
		eng.stopEngine();
	}
}
