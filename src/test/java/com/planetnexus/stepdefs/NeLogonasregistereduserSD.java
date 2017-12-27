package com.planetnexus.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.planetnexus.pageobject.NeLogonasregistereduserPF;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NeLogonasregistereduserSD {
WebDriver driver;

	
	@Given("^visits the homepage$")
	public void visits_the_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tahsena\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver(); //driver declare
	    driver.get("http://demostore.kenticolab.com/Home.aspx"); 
	    
	}

	@When("^user click on the log on button$")
	public void user_click_on_the_log_on_button() throws Throwable {
		NeLogonasregistereduserPF ob=new NeLogonasregistereduserPF(driver);
		ob.logon().click();
	}

	@When("^enter my valid \"([^\"]*)\" and  wrong \"([^\"]*)\"$")
	public void enter_my_valid_and_wrong(String arg1, String arg2) throws Throwable {
		NeLogonasregistereduserPF ob=new NeLogonasregistereduserPF(driver);
		ob.username().sendKeys(arg1);
		ob.password().sendKeys(arg2);
		
	}

	@When("^click the Log on button$")
	public void click_the_Log_on_button() throws Throwable {
		NeLogonasregistereduserPF ob=new NeLogonasregistereduserPF(driver);
		ob.logon1().click();
	}

	@Then("^User will not be logged on$")
	public void user_will_not_be_logged_on() throws Throwable {
	    
	}


}
