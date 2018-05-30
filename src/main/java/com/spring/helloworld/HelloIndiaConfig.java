package com.spring.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class HelloIndiaConfig {
	@Bean(initMethod="init")
	@Scope("prototype")
	public HelloIndia helloIndia(){
		return new HelloIndia();
	}
}
