package com.acce.collection;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector vector = new Vector();
		
		System.out.println(vector.capacity());
		vector.addElement("A");
		vector.add("B");
		vector.addElement(10);
		System.out.println(vector);
		
		for(int i=1; i<=10; i++){
			vector.addElement(i);
		}
		System.out.println(vector.capacity());
		
	}

}
