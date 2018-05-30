package com.spring.helloworld;

public class HelloIndia {
	private String message;
	   
	public void setMessage(String message){
		this.message  = message;
	}
   
	public void getMessage(){
		System.out.println("Your Message : " + message);
	}
	
	public void init(){
		System.out.println("Init Method called");
	}
	
	public void cleanup(){
		System.out.println("Destory Method called");
	}
}
