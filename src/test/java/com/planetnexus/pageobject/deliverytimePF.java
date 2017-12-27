package com.planetnexus.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class deliverytimePF {

	WebDriver driver;
	
	public deliverytimePF (WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"form\"]/header/div[1]/div/div[1]/ul/li[3]/a")
	WebElement click_help;
	
	public WebElement help () {
		return click_help;
			}
	
	@FindBy(xpath="//*[@id=\"form\"]/section/div/div/div[2]/div[2]/ul/li[2]/span")
	WebElement click_orderdelivery;
	
	public WebElement orderdelivery () {
		return click_orderdelivery;
		}
	
	
}
