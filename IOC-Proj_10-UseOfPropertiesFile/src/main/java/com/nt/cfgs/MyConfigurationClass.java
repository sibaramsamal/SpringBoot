package com.nt.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages="com.nt.beans")

@ImportResource("com/nt/commons/applicationContext.xml")
public class MyConfigurationClass {
	
}
