package com.nt.factory;

import com.nt.components.BlueDart;
import com.nt.components.DTDC;
import com.nt.components.Flipcart;

public class FlipcartFactory {
	public static Flipcart getFlipcartObject(String courierName) {
		Flipcart fct = new Flipcart();
		if (courierName.equalsIgnoreCase("DTDC")) {
			fct.setCourierPartner(new DTDC());
		} 
		else if (courierName.equalsIgnoreCase("BlueDart")) {
			fct.setCourierPartner(new BlueDart());
		}
		return fct;
	}
}
