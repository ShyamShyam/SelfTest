package com.acce.thread;

public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyRunnableThread myThread = new MyRunnableThread();
		
		Thread t1 = new Thread();
		Thread t = new Thread(myThread);
		
		//t1.start(); //A new Thread will be created which is responsible for the execution of Thread class run()method 
		//t1.run(); //No new Thread will be created but Thread class run() method will be executed just like a normal method call.
		
		//t.start(); //New Thread will be created which is responsible for the execution of MyRunnable run() method.
		//t.run(); //No new Thread will be created and MyRunnable run() method will be executed just like a normal method call.
		
		//myThread.start(); Error
		
		myThread.run(); //No new Thread will be created and MyRunnable class run() method will be executed just like a normal method call.
		
		for(int i=0; i<10; i++)
			System.out.println("Main Thrad");
	}

}
