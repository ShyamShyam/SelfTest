package com.acce.thread;

public class ThreadPriorityDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread t = new MyThread();
		t.setPriority(10);
		t.start();
		
		for(int i=0; i<10; i++){
			System.out.println("Main Thread");
		}
	}

}
