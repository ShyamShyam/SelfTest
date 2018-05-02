package com.acce.thread;

public class MyThread extends Thread {

	public void run(){
		for(int i=0; i<10; i++){
			Thread.yield();
			System.out.println("Child Thread");
		}
	}
	
	/*
	public void start(){
		super.start();
		System.out.println("Loacal Start Mehtod");
	}*/
}
