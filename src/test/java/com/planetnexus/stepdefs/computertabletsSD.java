package com.planetnexus.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class computertabletsSD {

	
	WebDriver driver;
	
	@Given("^User does visit the homepage$")
	public void user_does_visit_the_homepage() throws Throwable {
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\Tahsena\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver(); //driver declare 
*/	   
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demostore.kenticolab.com");
	    
	    WebElement element=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
	    Actions act=new Actions(driver);
	    act.moveToElement(element).build().perform();
	    driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[1]/a")).click();
	}

	@When("^hoover the mouse over computers$")
	public void hoover_the_mouse_over_computers() throws Throwable {
	    
	}

	@When("^click on tablets$")
	public void click_on_tablets() throws Throwable {
	    
	}

	@Then("^User will be able to view the available tablets on the site$")
	public void user_will_be_able_to_view_the_available_tablets_on_the_site() throws Throwable {
	    
	}
}
