package com.planetnexus.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.planetnexus.pageobject.MemberareaPF;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class memberareaSD {
WebDriver driver;

	@Given("^user visits homepage$")
	public void user_visits_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tahsena\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver(); //driver declare 
	    driver.get("http://demostore.kenticolab.com/Home.aspx");
	}

	@When("^user click on members area$")
	public void user_click_on_members_area() throws Throwable {
		MemberareaPF ob=new MemberareaPF(driver);
		ob.memberarea().click();
		
	}

	@Then("^user gets informtion about it\\.$")
	public void user_gets_informtion_about_it() throws Throwable {
	    
	}


}
