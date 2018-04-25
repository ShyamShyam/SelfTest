package com.acce.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class PropertiesDemo1 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		Properties p = new Properties();
		
		FileInputStream fis = new FileInputStream("src/com/acce/map/db.properties");
		p.load(fis);;
		
		String url = p.getProperty("url");
		String usr = p.getProperty("user");
		String pwd = p.getProperty("password");
		
		Connection con = DriverManager.getConnection(url, usr, pwd);
		
		FileOutputStream fos = new FileOutputStream("src/com/acce/map/db.properties");
		p.store(fos, "Updates by Shyam");
	}

}
