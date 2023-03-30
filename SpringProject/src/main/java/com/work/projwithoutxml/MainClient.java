package com.work.projwithoutxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClient {
	public static void main(String[] args) {
		System.out.println("execution started");
		ApplicationContext con = new AnnotationConfigApplicationContext(PizzaConfig.class); 
//		Pizza p=con.getBean("firstPizza",Pizza.class);
//		here we have used bean annotation we have to call the getPizza method 
//		Pizza p=con.getBean("getPizza",Pizza.class);
		//here we have passed the name of bean as "a,b,c" we can use any one among it
		Pizza p=con.getBean("a",Pizza.class);
		System.out.println(p);
		p.deliver();
		System.out.println("execution stopped");
	}

}
 