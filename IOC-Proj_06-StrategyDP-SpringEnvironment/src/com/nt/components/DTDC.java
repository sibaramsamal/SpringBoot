package com.nt.components;

public class DTDC implements CourierServiceProvider {

	@Override
	public String deliveryStatus() {
		return "Order will be delivered by DTDC courier service.";
	}

}
