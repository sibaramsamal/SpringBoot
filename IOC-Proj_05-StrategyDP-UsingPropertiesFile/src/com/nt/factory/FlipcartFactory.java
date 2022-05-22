package com.nt.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.nt.components.CouriorServiceProvider;
import com.nt.components.Flipcart;

public class FlipcartFactory {
	private static Properties p = null;
	{
		try {
			InputStream is = new FileInputStream("src/com/nt/commons/application.properties");
			p = new Properties();
			p.load(is);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static Flipcart getFlipcartObject() {
		Flipcart fct = new Flipcart();
		CouriorServiceProvider cpr = null;
		try {
			cpr = (CouriorServiceProvider)Class.forName(p.getProperty("sdp.dependent")).newInstance();
			
			fct.setCourierPartner(cpr);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return fct;
	}
}
