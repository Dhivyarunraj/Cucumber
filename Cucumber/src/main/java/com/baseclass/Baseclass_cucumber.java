package com.baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Baseclass_cucumber {
public static WebDriver driver;
	
	public static WebDriver browserLaunch(String string) {
		WebDriverManager.chromedriver().setup();
		return driver = new ChromeDriver();
	}
	public static void geturl(String url)
	{
		driver.get(url);
	}
	public static void sendValues(WebElement element, String value) 
	{
		element.sendKeys(value);
	}
	public static void clickelement(WebElement element)
	{
		element.click();
		}

}
