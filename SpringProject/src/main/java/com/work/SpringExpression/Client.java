package com.work.SpringExpression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		System.out.println("execution started");
		ApplicationContext con = new ClassPathXmlApplicationContext("com/work/SpringExpression/Spel.xml");
		SpElExp s=con.getBean("bean1",SpElExp.class);
		 System.out.println(s);
		System.out.println("execution stopped");
	}

}
