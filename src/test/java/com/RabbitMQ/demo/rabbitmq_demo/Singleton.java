package com.RabbitMQ.demo.rabbitmq_demo;

public class Singleton {

	private static Singleton singleton = new Singleton();
	
	private Singleton(){}
	
	public static Singleton getInstance(){
		
		return singleton;
	}
	
	public static void main(String[] args) {
		System.out.println("");
	}
}
