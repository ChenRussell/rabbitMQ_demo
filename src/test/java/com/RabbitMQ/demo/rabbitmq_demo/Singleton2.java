package com.RabbitMQ.demo.rabbitmq_demo;

public class Singleton2 {

	private static Singleton2 singleton;
	private Singleton2(){}
	
	public static Singleton2 getInstance(){
		
		if(singleton == null){
			return singleton = new Singleton2();
		}
		else return singleton;
	}
	
	public void getMessage(){
		System.out.println("I am chenrui!");
	}
	
	public static void main(String[] args) {
		Singleton2 instance = Singleton2.getInstance();
		System.out.println(instance);
		Singleton2 instance2 = Singleton2.getInstance();
		System.out.println(instance2);
		if(instance == instance2){
			System.out.println("because this is singleton pattern!");
		}
		
		instance.getMessage();
	}
	
}
