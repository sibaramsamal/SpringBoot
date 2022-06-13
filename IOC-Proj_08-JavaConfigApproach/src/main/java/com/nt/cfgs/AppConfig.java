package com.nt.cfgs;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nt.beans")
public class AppConfig {
	@Bean("dt")
	public LocalDateTime getDate() {
		return LocalDateTime.now();
	}
}
/*
	This is our java configuration file. @Configuration tells this.
	
	@ConmonentScan() is to tell hi that go to the mensioned package and serch for all the steriotype
	annotated classes and make object pf them without any question
	
	@Bean annotation is for telling that this is the logic for object creation of some predefined class.
	So execute and follow the instructions mensioned inside it.

*/