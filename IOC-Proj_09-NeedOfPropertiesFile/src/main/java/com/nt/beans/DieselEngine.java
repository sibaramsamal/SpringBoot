package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("diesel")
//@Primary
public final class DieselEngine implements Engine {

	@Override
	public void startEngine() {
		System.out.println("Diesel Engine started.");
	}

	@Override
	public void stopEngine() {
		System.out.println("Diesel Engine stopped.");
	}

}
