package org.browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseoveraction {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vinot\\eclipse-workspace\\SelDemo\\src\\Driver\\chromedriver.exe ");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.greenstechnologys.com/");
	WebElement lnkCourses = driver.findElement(By.xpath("//a[text()='COURSES']")); 
	Actions action=new Actions(driver);
	action.moveToElement(lnkCourses).perform();
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	WebElement lnkBigdata = driver.findElement(By.xpath("//a[text()='Oracle Training']"));
	action.moveToElement(lnkBigdata).perform();
	WebElement lnkPerf = driver.findElement(By.xpath("//span[text()='Performance Tuning']"));
	lnkPerf.click();
}
}
