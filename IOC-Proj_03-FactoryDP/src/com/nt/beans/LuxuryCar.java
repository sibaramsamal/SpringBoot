package com.nt.beans;

public class LuxuryCar implements Car{
	private Tyre t;
	public LuxuryCar(Tyre t) {
		this.t = t;
	}
	@Override
	public void configuration() {
		System.out.println("Luxury car: having tyres\n"+t.grip());
	}
}
