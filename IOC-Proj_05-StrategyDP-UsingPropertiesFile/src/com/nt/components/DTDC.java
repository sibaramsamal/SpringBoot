package com.nt.components;

public class DTDC implements CouriorServiceProvider {

	@Override
	public String deliveryStatus(int orderId)  {
		return "Order will be delivered for order ID: "+orderId+" by DTDC courior services.";
	}
}
