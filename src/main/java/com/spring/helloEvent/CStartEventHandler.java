package com.spring.helloEvent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextStartedEvent;

@Configuration
public class CStartEventHandler extends ContextStartedEvent {
	private static final long serialVersionUID = 1L;

	public CStartEventHandler(ApplicationContext source) {
		super(source);
	}

	public void onApplicationEvent(ContextStartedEvent event) {
	      System.out.println("ContextStartedEvent Received");
	}
	public void init(){
		System.out.println("Start Event init");
	}
}
