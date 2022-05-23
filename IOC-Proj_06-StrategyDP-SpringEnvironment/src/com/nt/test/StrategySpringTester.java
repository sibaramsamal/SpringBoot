package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.components.Flipcart;

public class StrategySpringTester {

	public static void main(String[] args) {
		Flipcart fct = null;
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		fct = factory.getBean("fct", Flipcart.class);
		fct.calculateBillAmount(new String[] {"charger","cover","memory chip","simcard"},
								new float[] {368.0f,150.00f,560.00f,600.00f});
	}
}
