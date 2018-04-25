package com.acce.collection;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		
		//Employee e1 = (Employee)obj1;
		//Employee e2 = (Employee)obj2;
		
		//String s1 = e1.eName;
		//String s2 = e2.eName;
		
		//Integer i1 = (Integer)obj1;
		//Integer i2 = (Integer)obj2;
		
		String str1 = obj1.toString();
		String str2 = obj2.toString();
		
		//int l1 = str1.length();
		//int l2 = str2.length();
		
		
		/*if(l1 < l2)
			return -1;
		else if(l1 > l2)
			return 1;
		else
			return str1.compareTo(str2);
		*/
		
		//return i1.compareTo(i2);
		//return -i1.compareTo(i2);
		//return i2.compareTo(i1);
		//return -i2.compareTo(i1);
		//return -1;
		//return +1;
		//return 0;
		
		//return str2.compareTo(str1);
		//return -str1.compareTo(str2);
		
		return str2.compareTo(str1);
		
		//return s1.compareTo(s2);
	}

}
