package com.planetnexus.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

    public class action {
	static WebDriver driver;
	public static void main(String[] args) {
	/*	System.setProperty("webdriver.chrome.driver","C:\\Users\\Tahsena\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demostore.kenticolab.com/Home.aspx");*/
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demostore.kenticolab.com/Home.aspx");
		WebElement element=driver.findElement(By.xpath("//a[@href='/Products/Electronics.aspx']"));
		Actions act=new Actions (driver);
		act.moveToElement(element).build().perform();
		driver.findElement(By.xpath("//a[@href='/Products/Electronics/Televisions/3D.aspx']")).click();
		
		/*WebElement element = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/a"));

		Actions act = new Actions(driver);
		//act.moveToElement(element).moveToElement(driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/ul/li[1]/ul/li[3]/a"))).click().build().perform();
		act.moveToElement(element).build().perform();
		*/}}
