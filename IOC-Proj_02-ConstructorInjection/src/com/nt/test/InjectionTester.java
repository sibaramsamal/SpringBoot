package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.Student;

public class InjectionTester {
	public static void main(String[] args) {
		Student std = null;
		BeanFactory factory = null;
		Resource res = null;
		res = new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		factory = new XmlBeanFactory(res);
		Object obj = factory.getBean("std");
		std = (Student)obj;
		std.showData();
	}
}
