package com.nt.components;

import com.nt.beans.BudgetCar;
import com.nt.beans.CEAT;
import com.nt.beans.Car;
import com.nt.beans.LuxuryCar;
import com.nt.beans.MRF;
import com.nt.beans.SportsCar;
import com.nt.beans.Tyre;

public class CarFactory {
	private static Car c;
	public static Car getCarInstance(String carName) {
		if(carName.equalsIgnoreCase("SportsCar")) {
			Tyre t = new MRF();
			c = new SportsCar(t);
		}
		else if(carName.equalsIgnoreCase("BudgetCar")) {
			Tyre t = new MRF();
			c = new BudgetCar(t);
		}
		
		else if(carName.equalsIgnoreCase("LuxuryCar")) {
			Tyre t = new CEAT();
			c = new LuxuryCar(t);
		}
		return c;
	}
}
