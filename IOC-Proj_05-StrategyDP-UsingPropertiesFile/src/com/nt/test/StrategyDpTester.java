package com.nt.test;

import com.nt.components.Flipcart;
import com.nt.factory.FlipcartFactory;

public class StrategyDpTester {
	public static void main(String[] args) {
		Flipcart fct = FlipcartFactory.getFlipcartObject();
		String[] items = {"T-Shirt","Pant","Body spray","Shoes","Mobile"};
		float[] prices = {780.00f, 1500.00f, 199.00f, 1499.00f, 11999.00f};
		fct.calculateBillAmount(items, prices);
	}
}