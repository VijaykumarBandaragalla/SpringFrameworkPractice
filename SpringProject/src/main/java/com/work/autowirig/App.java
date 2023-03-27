package com.work.autowirig;

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
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/work/autowirig/Config8.xml");
//       Certificate c = context.getBean("certi",Certificate.class);
//       System.out.println(c);
//       System.out.println("===============================================================");
       Student s = context.getBean("stud1",Student.class);
       System.out.println(s);
        System.out.println("Project Ended");
    }
}
