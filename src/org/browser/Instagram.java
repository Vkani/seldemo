package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vinot\\\\eclipse-workspace\\\\SelDemo\\\\src\\\\Driver\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.swiggy.com/");
	WebElement txtSign = driver.findElement(By.xpath("//a[@class='r2iyh']"));
	txtSign.click();
	WebElement txtPhoneNo = driver.findElement(By.xpath("//input[@id='mobile']"));
	txtPhoneNo.sendKeys("1234567890");
	WebElement txtName = driver.findElement(By.xpath("//input[@id='name']"));
	txtName.sendKeys("Kani");
	WebElement txtEmail = driver.findElement(By.xpath("//input[@id='email']"));
	txtEmail.sendKeys("vino.34");
	WebElement txtPasswd = driver.findElement(By.xpath("//input[@id='password']"));
	txtPasswd.sendKeys("34fg");
	
	//driver.close();
}
}
