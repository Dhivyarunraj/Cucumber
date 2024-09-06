package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;
import com.pageobjectmodel.Pageobjectmdl_cucumber;

public class Pomanager_cucumber {
	WebDriver driver;
	private Pageobjectmdl_cucumber pom;
	public Pageobjectmdl_cucumber getinstancelogin()
	{
		pom= new Pageobjectmdl_cucumber(driver);
		return pom;
		}
	public Pomanager_cucumber (WebDriver abc)
	{
		driver=abc;
		//PageFactory.initElements(driver, this);
		}

}
