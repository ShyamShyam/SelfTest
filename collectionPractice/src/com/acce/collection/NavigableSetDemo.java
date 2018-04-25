package com.acce.collection;

import java.util.TreeSet;

public class NavigableSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> tSet = new TreeSet<Integer>();
		
		tSet.add(1000);
		tSet.add(2000);
		tSet.add(3000);
		tSet.add(4000);
		tSet.add(5000);
		
		System.out.println(tSet);
		
		System.out.println(tSet.ceiling(1000));
		System.out.println(tSet.higher(2000));
		System.out.println(tSet.floor(1000));
		System.out.println(tSet.lower(4000));
		
		System.out.println(tSet.pollFirst());
		System.out.println(tSet.pollLast());
		
		System.out.println(tSet);
		
		System.out.println(tSet.descendingSet());
	}

}
