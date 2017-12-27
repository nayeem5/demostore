package com.planetnexus.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.planetnexus.pageobject.contactPF;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class contactSD {
	
	WebDriver driver;
	
	@Given("^visit the homepage of site$")
	public void visit_the_homepage_of_site() throws Throwable {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Tahsena\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver =new ChromeDriver();
	    driver.get("http://demostore.kenticolab.com/Home.aspx");
	}

	@When("^visitor click contact$")
	public void visitor_click_contact() throws Throwable {
		contactPF ob=new contactPF(driver);
		ob.contact().click();
	}

	@When("^visitor click on about us$")
	public void visitor_click_on_about_us() throws Throwable {
		contactPF ob=new contactPF(driver);
		ob.aboutus().click();
	}

	@Then("^visitor can see the information$")
	public void visitor_can_see_the_information() throws Throwable {
	    
	}


}
