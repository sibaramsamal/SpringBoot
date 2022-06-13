package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("gas")
public final class GasEngine implements Engine {

	@Override
	public void startEngine() {
		System.out.println("Gas Engine started.");
	}

	@Override
	public void stopEngine() {
		System.out.println("Gas Engine stopped.");
	}
}
