package com.spring.helloEvent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextStoppedEvent;

@Configuration
public class CStopEventHandler extends ContextStoppedEvent{

	private static final long serialVersionUID = 1L;

	public CStopEventHandler(ApplicationContext source) {
		super(source);
	}

	public void onApplicationEvent(ContextStoppedEvent event) {
	      System.out.println("ContextStoppedEvent Received");
	}
	
	public void init(){
		System.out.println("Start Event init");
	}

}
