package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\vinot\\eclipse-workspace\\SelDemo\\src\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(" https://netbanking.hdfcbank.com/");
    WebElement longCustomerId = driver.findElement(By.id("fldLoginUserId"));
	longCustomerId.sendKeys("12345");
	
	//driver.close();
}
}
