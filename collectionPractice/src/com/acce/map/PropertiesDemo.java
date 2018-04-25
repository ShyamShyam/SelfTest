package com.acce.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		Properties pro = new Properties();
		
		FileInputStream file = new FileInputStream("src/com/acce/map/shyam.properties");
		
		pro.load(file);
		System.out.println(pro);
		
		String str = pro.getProperty("user");
		System.out.println(str);
		
		pro.setProperty("port", "3307");
		System.out.println(pro.getProperty("port"));
		
		Enumeration enu = pro.propertyNames();
		while(enu.hasMoreElements()){
			String s1 = (String)enu.nextElement();
			System.out.println(s1);
		}
		
		FileOutputStream fileOut = new FileOutputStream("src/com/acce/map/shyam.properties");
		pro.store(fileOut, "Updated by Shyam");
	}

}
