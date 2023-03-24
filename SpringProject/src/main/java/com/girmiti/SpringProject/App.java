package com.girmiti.SpringProject;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("com/girmiti/SpringProject/Config1.xml");
        //upcasting
        
        Student a =(Student) context.getBean("student1");
        System.out.println(a);
        
        Student b = (Student) context.getBean("student2");
        System.out.println(b);
        		
        System.out.println("Project Ended");
    }
}
