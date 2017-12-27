package com.planetnexus.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.planetnexus.pageobject.pageobject3d;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class television3dSD {
WebDriver driver;

	
	@Given("^User visits the homepage$")
	public void user_visits_the_homepage() throws Throwable {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Tahsena\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   // driver =new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
	    driver.get("http://demostore.kenticolab.com/Home.aspx");
	    
		WebElement element=driver.findElement(By.xpath("//a[@href='/Products/Electronics.aspx']"));
		Actions act=new Actions (driver);
		act.moveToElement(element).build().perform();
		driver.findElement(By.xpath("//a[@href='/Products/Electronics/Televisions/3D.aspx']")).click();
		
	}

	@When("^hoover the mouse over electronics$")
	public void hoover_the_mouse_over_electronics() throws Throwable {
		
		pageobject3d ob=new pageobject3d(driver);
		ob.mousehover3d();
		/*WebElement element=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/a"));
		Actions act=new Actions (driver);
		act.moveToElement(element).build().perform();
		driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/ul/li[1]/ul/li[3]/a")).click();*/
		
	/*WebElement element=driver.findElement(By.xpath("//a[@href='/Products/Electronics.aspx']"));
		Actions act=new Actions (driver);
		act.moveToElement(element).build().perform();
		driver.findElement(By.xpath("//a[@href='/Products/Electronics/Televisions/3D.aspx']")).click();
		*/
	}

	@When("^click on (\\d+)D from the drop down menu$")
	public void click_on_D_from_the_drop_down_menu(int arg1) throws Throwable {
	    
	}

	@Then("^User will view the available (\\d+)D television on the site$")
	public void user_will_view_the_available_D_television_on_the_site(int arg1) throws Throwable {
	   
	}
}
