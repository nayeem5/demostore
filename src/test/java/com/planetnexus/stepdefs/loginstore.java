package com.planetnexus.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.planetnexus.pageobject.register;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginstore {
	
WebDriver driver;



	@Given("^User visits homepage$")
	public void user_visits_homepage() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tahsena\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver(); //driver declare 
	    driver.get("http://demostore.kenticolab.com/Home.aspx");
	}

	@When("^User clicks on register link$")
	public void user_clicks_on_register_link() {
		register ob=new register(driver);
		ob.register().click();
		
		
		
	}

	@When("^user enters \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"\\.$")
	public void user_enters(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
		register ob=new register(driver);
		ob.firstname().sendKeys(arg1);
		ob.lastname().sendKeys(arg2);
		ob.email().sendKeys(arg3);
		ob.password().sendKeys(arg4);
		ob.confirmpassword().sendKeys(arg5);
		
	}

	@When("^user clicks on submit button\\.$")
	public void user_clicks_on_submit_button() { 
		register ob=new register(driver);
		ob.registers().click();
		}
	
	@Then("^user closes the browser$")
	public void user_closes_the_browser()  {
	   driver.close();
	}
	
}


