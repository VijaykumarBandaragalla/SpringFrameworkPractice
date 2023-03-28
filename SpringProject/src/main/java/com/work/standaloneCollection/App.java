package com.work.standaloneCollection;

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
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/work/standaloneCollection/StandAloneCollectionConfig.xml");
        Emp a =context.getBean("emp1",Emp.class);
        System.out.println("===================================================================");
        System.out.println(a.getVehicle());
        System.out.println(a.getVehicle().getClass().getName());
        System.out.println("===================================================================");
        System.out.println(a.getEmail());
        System.out.println(a.getEmail().getClass().getName());
        System.out.println("===================================================================");
        System.out.println(a.getName());
        System.out.println(a.getName().getClass().getName());
        System.out.println("===================================================================");
        System.out.println(a.getDpdrop());
        System.out.println(a.getDpdrop().getClass().getName());
        
        System.out.println("Project Ended");
    }
}
