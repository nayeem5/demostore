package com.planetnexus.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.planetnexus.pageobject.logonasregistereduserPF;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class logonasregistereduserSD {
	
WebDriver driver;


	
	@Given("^User visit homepage$")
	public void user_visit_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tahsena\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver(); //driver declare
	    driver.get("http://demostore.kenticolab.com/Home.aspx"); 
	}

	@When("^click on the log on button$")
	public void click_on_the_log_on_button() throws Throwable {
		logonasregistereduserPF ob=new logonasregistereduserPF(driver);
		ob.logon().click();
		
	}

	@When("^enter my \"([^\"]*)\" and   \"([^\"]*)\"$")
	public void enter_my_and(String arg1, String arg2) throws Throwable {
		logonasregistereduserPF ob=new logonasregistereduserPF(driver);
		ob.username().sendKeys(arg1);
		ob.password().sendKeys(arg2);
		
		
	}

	@When("^click Log on button$")
	public void click_Log_on_button() throws Throwable {
		logonasregistereduserPF ob=new logonasregistereduserPF(driver);
		ob.logon1().click();
	}

	@Then("^User will be logged on$")
	public void user_will_be_logged_on() throws Throwable {
	    
	}
}
