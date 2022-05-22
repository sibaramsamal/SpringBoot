package com.nt.components;

public class FirstFlight implements CouriorServiceProvider {

	@Override
	public String deliveryStatus(int orderId) {
		return "Order will be delivered for order ID: "+orderId+" by First Flight courior services.";
	}

}
