package com.work.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Project Started");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/girmiti/constructorinjection/Config4.xml");
		
		Dept d=context.getBean("refdept",Dept.class);
		Emp e=context.getBean("refemp",Emp.class);
		System.out.println(d);
		System.out.println(e);
		
		
// Emp e = context.getBean("emp1",Emp.class);
//        System.out.println(e);

		System.out.println("project stopped");

	}
}
