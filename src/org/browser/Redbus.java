package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vinot\\\\eclipse-workspace\\\\SelDemo\\\\src\\\\Driver\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.redbus.in/ ");
	String a=driver.getTitle();
	System.out.println(a);
	WebElement txtFrom = driver.findElement(By.id("src"));
	txtFrom.sendKeys("Chennai");
	//WebElement btnclick1 = driver.findElement(By.xpath("//li[@class=\"selected\"]"));
	//btnclick1.click();
	WebElement txtTo = driver.findElement(By.id("dest"));
	txtTo.sendKeys("Thanjavur");
	WebElement intDate = driver.findElement(By.id("onward_cal"));
	intDate.sendKeys("15-feb-2022");
	WebElement btnClick = driver.findElement(By.id("search_btn"));
	btnClick.click();
	//driver.close();
}
}
