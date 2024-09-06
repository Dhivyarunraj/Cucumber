package com.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.Baseclass_cucumber;
import com.pageobjectmanager.Pomanager_cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/com/featurefile/Testrunner.feature", 
			glue="com.stepdefinition", 
			plugin= {"html:HtmlReport/Practice.html" ,"pretty"})

public class CucuRunner extends Baseclass_cucumber {
	public static WebDriver driver;

	@BeforeClass

	public static void setup()
	{
		driver= browserLaunch("chrome");
	}
	@AfterClass
public static void teardown()
{
	driver.quit();
	}
}

