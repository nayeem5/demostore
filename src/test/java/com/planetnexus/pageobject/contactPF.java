package com.planetnexus.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactPF {

	
	WebDriver driver;//declare driver (variable)
	 public contactPF (WebDriver driver) { //it is not void ,static
		 this.driver=driver;
		 PageFactory.initElements(driver, this);//connect page factory use .initelement
		 
	 }
	 
	 @FindBy(xpath="//*[@id=\"form\"]/header/div[1]/div/div[1]/ul/li[2]/a")
	 WebElement click_contact;
	 public WebElement contact() {
		return click_contact;
		 
	 }
	 @FindBy(xpath="//*[@id=\"contactmenu\"]/li[2]/a")
	 WebElement click_aboutus;
	 public WebElement aboutus() {
		return click_aboutus;
		 
	 }
}
