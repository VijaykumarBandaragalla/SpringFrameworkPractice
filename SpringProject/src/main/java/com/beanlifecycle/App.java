package com.beanlifecycle;

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
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/beanlifecycle/Config6.xml");
        Exam e = context.getBean("exam1",Exam.class);
        System.out.println(e); 
        context.registerShutdownHook();
        System.out.println("Project Ended");
    }
}
