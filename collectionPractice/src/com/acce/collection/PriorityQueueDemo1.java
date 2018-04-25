package com.acce.collection;

import java.util.PriorityQueue;

public class PriorityQueueDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue pq = new PriorityQueue(15, new MyComparator());
		
		pq.offer("A");
		pq.offer("B");
		pq.offer("Z");
		pq.offer("L");
		
		System.out.println(pq);
	}

}
