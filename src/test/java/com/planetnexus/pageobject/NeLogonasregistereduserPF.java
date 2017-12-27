package com.planetnexus.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeLogonasregistereduserPF {

	
	WebDriver driver;
	
	public NeLogonasregistereduserPF (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"form\"]/header/div[1]/div/div[3]/a[3]")
	WebElement click_logon;
	public WebElement logon() {
		return click_logon;
	}
	@FindBy(xpath="//*[@id=\"p_lt_ctl08_wPP_p_lt_ctl01_wPL_p_lt_ctl00_wCL_wCL_l1_wLF_Login1_UserName\"]")
		WebElement edit_username;
	public WebElement username() {
		return edit_username;
	}
		
		
	@FindBy(xpath="//*[@id=\"p_lt_ctl08_wPP_p_lt_ctl01_wPL_p_lt_ctl00_wCL_wCL_l1_wLF_Login1_Password\"]")
	WebElement edit_password;
	public WebElement password() {
		return edit_password;
		
	}
	@FindBy(xpath="//*[@id=\"p_lt_ctl08_wPP_p_lt_ctl01_wPL_p_lt_ctl00_wCL_wCL_l1_wLF_Login1_LoginButton\"]")
	WebElement click_logon1;
	public WebElement logon1() {
		return click_logon1;
		
	}
}
