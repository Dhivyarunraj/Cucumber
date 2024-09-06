package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.baseclass.Baseclass_cucumber;
import com.helper.DataReader;
import com.helper.Datareadermanager;
import com.pageobjectmanager.Pomanager_cucumber;
import com.testrunner.CucuRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends Baseclass_cucumber{
	public static WebDriver driver = CucuRunner.driver;
	public static Pomanager_cucumber pom = new Pomanager_cucumber(driver);
	@Given("user launch the url")
	public void user_launch_the_url() throws IOException  {
		//geturl("https://adactinhotelapp.com/index.php");
		String getpropurl = Datareadermanager.getinstanceDRM().getinstanceDataReader().getpropurl();
		geturl(getpropurl);
	}

	@When("User enter the username in username field")
	public void user_enter_the_username_in_username_field() throws IOException  {
		//sendValues(pom.getinstancelogin().getUname(),"dhivyabharathin");
		String getpropusername = Datareadermanager.getinstanceDRM().getinstanceDataReader().getpropusername();
	    sendValues(pom.getinstancelogin().getUname(), getpropusername);
	}

	@When("user enter the password in password field")
	public void user_enter_the_password_in_password_field() throws IOException  {
		//sendValues(pom.getinstancelogin().getPasword(),"divirathi15");
		String getproppasword = Datareadermanager.getinstanceDRM().getinstanceDataReader().getproppasword();
	    sendValues(pom.getinstancelogin().getPasword(), getproppasword);
	}

	@Then("user click the login Button And it navigate to search page")
	public void user_click_the_login_Button_And_it_navigate_to_search_page()  {
		clickelement(pom.getinstancelogin().getLogin());   
	}
	


}
