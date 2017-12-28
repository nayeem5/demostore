package com.planetnexus.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MemberareaPF {

	WebDriver driver;
	
	public MemberareaPF(WebDriver driver) {
		this.driver=driver;  
		PageFactory.initElements(driver, this);
		}
	
@FindBy(xpath="//*[@id=\"form\"]/header/div[1]/div/div[1]/ul/li[4]/a")

WebElement click_memberarea;
public WebElement memberarea() {
	return click_memberarea;
	
}


}
