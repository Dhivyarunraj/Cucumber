package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataReader {
	public static Properties p;
	public DataReader() throws IOException
	{
	File f = new File("C:\\Users\\MY-PC\\eclipse-workspace\\Cucumber\\src\\main\\java\\com\\propertyfile\\Adact.properties");
	FileInputStream fis = new FileInputStream(f);
	p = new Properties();
	p.load(fis);
	}
	public String getpropurl() {
	String url = p.getProperty("url");
	return url;
	}
	public String getpropusername()
	{
		String username = p.getProperty("username");	
		return username;
	}
	public String getproppasword()
	{
	String password = p.getProperty("password");
	return password;
	}
}
