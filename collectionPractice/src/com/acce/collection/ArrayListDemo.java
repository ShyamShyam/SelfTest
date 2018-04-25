package com.acce.collection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.RandomAccess;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList arrayList = new ArrayList();
		
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		System.out.println(arrayList);
		arrayList.add(10);
		arrayList.add(null);
		System.out.println(arrayList);
		arrayList.remove(2);
		System.out.println(arrayList);
		arrayList.add(2, "C");
		System.out.println(arrayList);
		arrayList.add("D");
		System.out.println(arrayList.get(3));
		System.out.println(arrayList);
		System.out.println(arrayList instanceof Serializable);
		System.out.println(arrayList instanceof Cloneable);
		System.out.println(arrayList instanceof RandomAccess);
	}

}
