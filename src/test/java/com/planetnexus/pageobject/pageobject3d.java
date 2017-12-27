package com.planetnexus.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class pageobject3d {
	WebDriver driver;
	
	public pageobject3d (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
public void mousehover3d () {
	
	WebElement Electronics=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/a"));
	
	WebElement p3d=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/ul/li[1]/ul/li[3]/a"));
	
	 Actions act=new Actions(driver);
	 act.moveToElement(Electronics).perform();
	
	 act.moveToElement(p3d).perform();
	 act.click().build().perform();
	
}
}
