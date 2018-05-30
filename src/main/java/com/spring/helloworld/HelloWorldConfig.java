package com.spring.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Configuration
@Import(HelloIndiaConfig.class)
public class HelloWorldConfig {
	@Bean(initMethod="init")
	@Scope("prototype")
	public HelloWorld helloWorld(){
		return new HelloWorld();
	}
	
	public void preInit(){
		System.out.println("Init method called");
	}
}
