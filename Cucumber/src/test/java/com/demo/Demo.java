package com.demo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Demo {
	
	@After
	public void logout()
	{
		System.out.println("logout");
	}
	@Test
	public void login()
	{
		System.out.println("login");
	}
	@Before
	public void browserlaunch()
	{
		System.out.println("browser launch");
	}
	@BeforeClass
	public static void setproperty()
	{
		System.out.println("set property");
	}
	@AfterClass
	public static void closebrowser()
	{
		System.out.println("close browser");
	}
	

}
