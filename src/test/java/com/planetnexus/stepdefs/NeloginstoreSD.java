package com.planetnexus.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.planetnexus.pageobject.NeLogonStore;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NeloginstoreSD {
	WebDriver driver;
	
	@Given("^User does visit homepage\\.$")
	public void user_does_visit_homepage() throws Throwable {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tahsena\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver =new ChromeDriver();
	    driver.get("http://demostore.kenticolab.com/Home.aspx");
	}

	@When("^User does click on register link$")
	public void user_does_click_on_register_link() throws Throwable {
		NeLogonStore ob=new NeLogonStore(driver);
		ob.register().click();
	}

	@When("^user enters \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" , \"([^\"]*)\" , wrong \"([^\"]*)\"\\.$")
	public void user_enters_wrong(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
		NeLogonStore ob=new NeLogonStore(driver);
		ob.firstname().sendKeys(arg1);
		ob.lastname().sendKeys(arg2);
		ob.email().sendKeys(arg3);
		ob.password().sendKeys(arg4);
		ob.repassword().sendKeys(arg5);
		ob.registers().click();
	}

	@When("^user does click on submit button\\.$")
	public void user_does_click_on_submit_button() throws Throwable {
	
	}

	@Then("^User recieves password do not match\\.$")
	public void user_recieves_password_do_not_match() throws Throwable {
	   
	}

	@Then("^closes the browser$")
	public void closes_the_browser() throws Throwable {
	  
	}

}
