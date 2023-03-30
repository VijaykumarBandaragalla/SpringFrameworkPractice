package com.work.projwithoutxml;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.work.projwithoutxml")
public class PizzaConfig {
//	@Bean()
	@Bean(name= {"a","b","c"})
	public Pizza getPizza() {
		Pizza p = new Pizza();
		return p;
	}
}
