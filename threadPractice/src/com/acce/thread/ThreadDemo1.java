package com.acce.thread;

public class ThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread t = new MyThread();
		t.start();
		t.start();
		for(int i=0; i<10; i++)
			System.out.println("Main Thread");
	}

}
