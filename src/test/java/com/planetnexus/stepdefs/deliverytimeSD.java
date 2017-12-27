package com.planetnexus.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.planetnexus.pageobject.deliverytimePF;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class deliverytimeSD {

	WebDriver driver;
	@Given("^User visit the homepage$")
	public void user_visit_the_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tahsena\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demostore.kenticolab.com/Home.aspx");
	
	}
   
	
	@When("^clicks on help$")
	public void clicks_on_help() throws Throwable {
		deliverytimePF ob=new deliverytimePF (driver);
		ob.help().click();
		
	}

	@When("^then clicks on when will my order be delivered\\?$")
	public void then_clicks_on_when_will_my_order_be_delivered() throws Throwable {
		deliverytimePF ob=new deliverytimePF(driver);
		ob.orderdelivery().click();
	}

	@Then("^User will be able to view the the sites time window on deliveries$")
	public void user_will_be_able_to_view_the_the_sites_time_window_on_deliveries() throws Throwable {
	    
	}
}
