package com.planetnexus.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class register {

	WebDriver driver;
	
	public register (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"form\"]/header/div[1]/div/div[3]/a[2]")
	WebElement link_register;
	
	public WebElement register() {
		return link_register;
	}
		
		@FindBy(xpath="//*[@id=\"p_lt_ctl08_wPP_p_lt_ctl01_wPL_p_lt_ctl00_wCL_wCL_l1_wR_txtFirstName\"]")
		WebElement edit_firstname;
		public WebElement firstname() {
			return edit_firstname;
			} 
		@FindBy (xpath="//*[@id=\"p_lt_ctl08_wPP_p_lt_ctl01_wPL_p_lt_ctl00_wCL_wCL_l1_wR_txtLastName\"]")
		WebElement edit_lastname;
		public WebElement lastname() {
			return edit_lastname;
		}
		@FindBy (xpath="//*[@id=\"p_lt_ctl08_wPP_p_lt_ctl01_wPL_p_lt_ctl00_wCL_wCL_l1_wR_txtEmail\"]")
		WebElement edit_email;
		public WebElement email() {
			return edit_email;
		}
		@FindBy (xpath="//*[@id=\"p_lt_ctl08_wPP_p_lt_ctl01_wPL_p_lt_ctl00_wCL_wCL_l1_wR_passStrength_txtPassword\"]")
		WebElement edit_password;
		public WebElement password() {
			return edit_password;
		}
		@FindBy (xpath="//*[@id=\"p_lt_ctl08_wPP_p_lt_ctl01_wPL_p_lt_ctl00_wCL_wCL_l1_wR_txtConfirmPassword\"]")
		WebElement edit_confirmpassword;
		public WebElement confirmpassword() {
			return edit_confirmpassword;}
		
		@FindBy(xpath="//*[@id=\"p_lt_ctl08_wPP_p_lt_ctl01_wPL_p_lt_ctl00_wCL_wCL_l1_wR_btnOk\"]")
		WebElement click_register;
		public WebElement registers() {
			return click_register;
		
		}
		
}
