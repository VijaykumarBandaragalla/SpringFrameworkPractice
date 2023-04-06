package com.work.collectionspring;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("com/girmiti/CollectionSpring/Config2.xml");
        Emp p=(Emp) context.getBean("emp1",Emp.class);
        System.out.println(p);
        System.out.println("project stopped");
       
    }
}
