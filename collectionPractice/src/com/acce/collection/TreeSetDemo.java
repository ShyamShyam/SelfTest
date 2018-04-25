package com.acce.collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet treeSet = new TreeSet();
		treeSet.add("A");
		treeSet.add("B");
		treeSet.add("A");
		treeSet.add("b");
		//treeSet.add(new Integer(10));
		treeSet.add(null);
		System.out.println(treeSet);
	}

}
