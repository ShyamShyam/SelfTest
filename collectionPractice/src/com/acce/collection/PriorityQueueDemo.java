package com.acce.collection;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue pq = new PriorityQueue();
		
		System.out.println(pq.peek());
		//System.out.println(pq.element());
		//System.out.println(pq.remove());
		
		for(int i=0; i<=10; i++){
			pq.offer(i);
		}
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
	}

}
