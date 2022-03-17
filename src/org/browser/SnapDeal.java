package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vinot\\\\eclipse-workspace\\\\SelDemo\\\\src\\\\Driver\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
	WebElement txtFirstName = driver.findElement(By.xpath("//input[@name='firstName']"));
	txtFirstName.sendKeys("kani");
	WebElement txtLastName = driver.findElement(By.xpath("//input[@name='lastName']"));
	txtLastName.sendKeys("mozhi");
	WebElement txtEmail = driver.findElement(By.xpath("//input[@type='email']"));
	txtEmail.sendKeys("kani.cbe90@gmail.com");
	WebElement txtPasswd = driver.findElement(By.xpath("//input[@name='Passwd']"));
	txtPasswd.sendKeys("123jk");
	WebElement txtConfirmPasswd = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
	txtConfirmPasswd.sendKeys("123jk");
	driver.close();
	
	
	
	
}
}
