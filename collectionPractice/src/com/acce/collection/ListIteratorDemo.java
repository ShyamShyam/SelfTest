package com.acce.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list = new LinkedList();
		
		list.add("Shyam");
		list.add("Sharma");
		list.add("Shubham");
		list.add("Manju");
		System.out.println(list);
		
		ListIterator itr = list.listIterator();
		
		while(itr.hasNext()){
			String str = (String)itr.next();
			System.out.println(str);
			
			if(str.equals("Sharma"))
				 itr.set("Saket");
			if(str.equals("Manju"))
				itr.add("Rajesh");
		}
		 
		 System.out.println(list);
	}
}
