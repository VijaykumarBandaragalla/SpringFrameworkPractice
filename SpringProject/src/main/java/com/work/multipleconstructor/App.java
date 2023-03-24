package com.work.multipleconstructor;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("com/work/multipleconstructor/config5.xml");
        Test t=context.getBean("test1",Test.class);
        System.out.println(t); 
        t.add();
        System.out.println("Project Ended");
    }
}
