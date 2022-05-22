package com.nt.components;

import java.util.Arrays;

public class Flipcart {
	private CouriorServiceProvider cobj = null;
	
	public void setCourierPartner(CouriorServiceProvider cobj) {
		this.cobj = cobj;
	}
	public void calculateBillAmount(String[] items, float[] prices) {
		float totalAmount = 0.0f;
		for(float amt : prices)
			totalAmount += amt;
		System.out.println("Bill generated rs. "+totalAmount+" for the items: "+""
				+ ""+Arrays.toString(items)+" having prices: "+Arrays.toString(prices)+
				"\n"+cobj.deliveryStatus(0));
	}
	
	@Override
	public String toString() {
		return "Flipcart Object";
	}
}
