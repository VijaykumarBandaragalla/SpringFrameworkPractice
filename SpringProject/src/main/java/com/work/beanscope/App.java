package com.work.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.work.StereoTypeAnnotation.Ipl;

/**
 * Hello world!
 *
 */
public class App {
	
	
	// Singelton Scope Example
    public static void main( String[] args )
    {
        System.out.println( "Project Started" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/work/beanscope/scope.xml");
        //upcasting
        
        SingletonScopeAndAnnotationScope a =(SingletonScopeAndAnnotationScope) context.getBean("student1");
        
        System.out.println(a.hashCode()); 
        
        SingletonScopeAndAnnotationScope b = (SingletonScopeAndAnnotationScope) context.getBean("student1");
        System.out.println(b.hashCode()); 
        //same object has been returened bcz we have sqpecified singletone scope in xml (if we change the scope to prototype we get new object created)
        		
        System.out.println("Project Ended");
    }
}
