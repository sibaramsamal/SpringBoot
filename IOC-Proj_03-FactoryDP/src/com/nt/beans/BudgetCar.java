package com.nt.beans;

public class BudgetCar implements Car {
	
	private Tyre t;
	public BudgetCar(Tyre t) {
		this.t = t;
	}
	@Override
	public void configuration() {
		System.out.println("Budget car: having tyres\n"+t.grip());
	}

}
