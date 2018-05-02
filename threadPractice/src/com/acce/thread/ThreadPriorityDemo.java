package com.acce.thread;

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(10);
		
		System.out.println(Thread.currentThread().getPriority());
		
		MyThread t = new MyThread();
		
		System.out.println(t.currentThread().getPriority());
	}

}
