package com.nt.beans;

public class SportsCar implements Car {
	private Tyre t;

	public SportsCar(Tyre t) {
		this.t = t;
	}

	@Override
	public void configuration() {
		System.out.println("Sports car: having tyres\n" + t.grip());
	}

}
