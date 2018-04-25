package com.acce.collection;

import java.util.TreeSet;

public class CompComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee = new Employee("Shyam", 101);
		Employee employee1 = new Employee("Shubham", 102);
		Employee employee2 = new Employee("Manju", 103);
		Employee employee3 = new Employee("Rajesh", 104);
		Employee employee4 = new Employee("Saket", 105);
		
		TreeSet treeSet = new TreeSet();
		
		treeSet.add(employee);
		treeSet.add(employee1);
		treeSet.add(employee2);
		treeSet.add(employee3);
		treeSet.add(employee4);
		System.out.println(treeSet);
		
		TreeSet treeSet2 = new TreeSet(new MyComparator());
		
		treeSet2.add(employee);
		treeSet2.add(employee1);
		treeSet2.add(employee2);
		treeSet2.add(employee3);
		treeSet2.add(employee4);
		
		System.out.println(treeSet2);
	}

}
