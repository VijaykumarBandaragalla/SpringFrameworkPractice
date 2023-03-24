package com.girmiti.setterinjection;

import org.springframework.context.ApplicationContext;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("com/girmiti/setterinjection/Config3.xml");
        B b =context.getBean("refB",B.class);
        System.out.println(b);
        
        A a=context.getBean("refA",A.class);
        System.out.println(a);
        System.out.println("project stopped");
       
    }
}
