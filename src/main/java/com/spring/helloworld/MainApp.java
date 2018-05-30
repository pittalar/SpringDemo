package com.spring.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
	      ApplicationContext ctx = 
	         new AnnotationConfigApplicationContext(HelloWorldConfig.class);
	   
	      HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
	      helloWorld.setMessage("Hello World!");
	      helloWorld.getMessage();
	      
	      HelloIndia helloIndia = ctx.getBean(HelloIndia.class);
	      helloIndia.setMessage("Hello India!");
	      helloIndia.getMessage();
	      
	      AnnotationConfigApplicationContext annoCont = (AnnotationConfigApplicationContext)ctx;
	      annoCont.close();
	   }
}
