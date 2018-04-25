package com.acce.collection;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.RandomAccess;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList linkedList = new LinkedList();
		
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		System.out.println(linkedList);
		System.out.println(linkedList.size());
		System.out.println(linkedList.get(2));
		linkedList.add(10);
		linkedList.add(null);
		System.out.println(linkedList);
		System.out.println(linkedList.size());
		linkedList.addFirst("R");
		linkedList.addLast("S");
		System.out.println(linkedList);
		linkedList.set(0, "Software");
		System.out.println(linkedList);
		linkedList.removeLast();
		System.out.println(linkedList);
		System.out.println(linkedList instanceof Serializable);
		System.out.println(linkedList instanceof Cloneable);
		System.out.println(linkedList instanceof RandomAccess);
		System.out.println(linkedList.isEmpty());
		linkedList.clear();
		System.out.println(linkedList);
	}

}
