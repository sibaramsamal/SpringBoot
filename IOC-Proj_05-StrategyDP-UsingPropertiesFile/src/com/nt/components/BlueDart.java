package com.nt.components;

public class BlueDart implements CouriorServiceProvider {

	@Override
	public String deliveryStatus(int orderId)  {
		return "Order will be delivered for order ID: "+orderId+" by Blue Dart courior services.";
	}
}
