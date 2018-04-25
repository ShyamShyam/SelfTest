package com.acce.collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumrationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector vector = new Vector();
		 for(int i=0; i<=10; i++){
			 vector.addElement(i);
		 }
		 System.out.println(vector);
		 Enumeration enu = vector.elements();
		 while(enu.hasMoreElements()){
			 Integer i = (Integer)enu.nextElement();
			 if(i%2 == 0){
				 System.out.println(i);
			 }
		 }
	}

}
