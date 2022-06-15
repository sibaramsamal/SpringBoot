package com.nt;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@SpringBootApplication
public class BootProj02WorkingWithDataSourcesApplication {
	
	@Bean
	public DataSource getObject() throws Exception{
		ComboPooledDataSource ds = new ComboPooledDataSource();
		ds.setDriverClass("com.mysql.cj.jdbc.Driver");
		ds.setJdbcUrl("jdbc:mysql://localhost:3306/ntsb615");
		ds.setUser("root");
		ds.setPassword("");
		return ds;
	}
	public static void main(String[] args){
		ApplicationContext ctx = SpringApplication.run(BootProj02WorkingWithDataSourcesApplication.class, args);
		ConnectionProvider con = ctx.getBean("connection",ConnectionProvider.class);
		System.out.println("Current connection Objcet: "+con.getConnection()+" Provided by: "+con.getClass());
		System.out.println();
	}
}
