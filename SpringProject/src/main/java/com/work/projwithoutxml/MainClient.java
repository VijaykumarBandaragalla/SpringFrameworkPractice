package com.work.projwithoutxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClient {
	public static void main(String[] args) {
		ApplicationContext con = new AnnotationConfigApplicationContext(PizzaConfig.class); 
		Pizza p=con.getBean("firstPizza",Pizza.class);
		System.out.println(p);
		p.deliver();
		System.out.println("execution stopped");
	}

}
 