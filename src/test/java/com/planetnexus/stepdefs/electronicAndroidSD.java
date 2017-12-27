package com.planetnexus.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class electronicAndroidSD {
WebDriver driver;

	
	@Given("^User does visit homepage$")
	public void user_does_visit_homepage() throws Throwable {
	    WebDriver driver=new FirefoxDriver();
	    driver.get("http://demostore.kenticolab.com/Home.aspx");
	    
	    WebElement element= driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/a"));
	    Actions act=new Actions (driver);
	    act.moveToElement(element).build().perform();
	    driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/ul/li[2]/ul/li[1]/a")).click();
	    
	}

	@When("^hoovers the mouse over electronics$")
	public void hoovers_the_mouse_over_electronics() throws Throwable {
		
	}

	@When("^clicks on Android under cellphones$")
	public void clicks_on_Android_under_cellphones() throws Throwable {
	}

	@Then("^User is able to view the available Androids on the website$")
	public void user_is_able_to_view_the_available_Androids_on_the_website() throws Throwable {
	    
	}

}
