package com.beanlifecycle.interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started" );
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/beanlifecycle/interfaces/Config7.xml");
        ChickenFry c = context.getBean("c1",ChickenFry.class);
        System.out.println(c);
        context.registerShutdownHook();
        System.out.println("Project Ended");
    }
}
