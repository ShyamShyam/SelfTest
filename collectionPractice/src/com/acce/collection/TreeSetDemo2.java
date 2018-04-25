package com.acce.collection;

import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet treeSet = new TreeSet( new MyComparator());
		
		treeSet.add("Shyam");
		treeSet.add("Shubham");
		treeSet.add("Manju");
		treeSet.add("Rajesh");
		treeSet.add("Prasant");
		
		System.out.println(treeSet);
	}

}
