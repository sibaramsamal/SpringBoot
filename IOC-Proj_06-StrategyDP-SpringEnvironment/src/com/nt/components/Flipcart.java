package com.nt.components;

import java.util.Arrays;

public class Flipcart {
	private CourierServiceProvider courierCompany2 = null;
	
	public void setCourierCompany(CourierServiceProvider csp) {
		this.courierCompany2 = csp;
	}
	public void calculateBillAmount(String[] items, float[] prices) {
		float totalAmount = 0.0f;
		for(float amt : prices)
			totalAmount += amt;
		System.out.println("Bill generated rs. "+totalAmount+" for the items: "+""
				+ ""+Arrays.toString(items)+" having prices: "+Arrays.toString(prices)+
				"\n"+courierCompany2.deliveryStatus());
	}
}
