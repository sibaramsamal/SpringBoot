package com.nt.test;

import com.nt.beans.Car;
import com.nt.components.CarFactory;

public class FactoryTester {

	public static void main(String[] args) {
		Car c = CarFactory.getCarInstance("SportsCar");
		c.configuration();
	}

}
