package com.work.StereoTypeAnnotation;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("com/work/StereoTypeAnnotation/StereoAnnotationConfig.xml");
       Ipl a = context.getBean("ipl",Ipl.class);
       System.out.println(a);
        System.out.println("project stopped");
       
    }
}
