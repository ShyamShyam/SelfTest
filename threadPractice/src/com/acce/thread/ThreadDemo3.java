package com.acce.thread;

public class ThreadDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Thread.currentThread().getName());
		
		MyThread t = new MyThread();
		
		System.out.println(t.getName());
		
		Thread.currentThread().setName("Shyam Thraed");
		System.out.println(Thread.currentThread());
	}

}
