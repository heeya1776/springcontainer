package com.bit2015.springcontainer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit2015.springcontainer.dao.HelloService;

/**
 * Hello world!
 *
 */
public class App{
    public static void main( String[] args ){
    	
    	ApplicationContext ac = new ClassPathXmlApplicationContext("config/applicationContext.xml");
    	
    	HelloService hs = (HelloService)ac.getBean("helloService");
    	hs.hello();
    	
    	
        System.out.println( "Hello World!" );
        
    }
}
