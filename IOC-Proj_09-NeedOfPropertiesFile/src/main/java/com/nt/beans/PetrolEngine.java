package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("petrol")
public final class PetrolEngine implements Engine {

	@Override
	public void startEngine() {
		System.out.println("Petrol Engine started.");
	}

	@Override
	public void stopEngine() {
		System.out.println("Petrol Engine stopped.");
	}
}
