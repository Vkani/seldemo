package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Swiggy {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vinot\\\\eclipse-workspace\\\\SelDemo\\\\src\\\\Driver\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	WebElement s = driver.findElement(By.xpath("//li[@id='credit2']"));
WebElement d = driver.findElement(By.xpath("//ol[@id='bank']"));
	Actions actions=new Actions(driver);
	actions.dragAndDrop(s, d).perform();
	WebElement s1 = driver.findElement(By.xpath("//li[@class='block13 ui-draggable']"));
	WebElement d1 = driver.findElement(By.xpath("//ol[@id='amt7']"));
	Actions actions1=new Actions(driver);
	actions1.dragAndDrop(s1, d1).perform();
	WebElement s2 = driver.findElement(By.xpath("//li[@data-id=6]"));
	WebElement d2 = driver.findElement(By.xpath("//ol[@id='loan']"));
	Actions actions2=new Actions(driver);
	actions2.dragAndDrop(s2, d2).perform();
	WebElement s3 = driver.findElement(By.xpath("//li[@class='block13 ui-draggable']"));
	WebElement d3 = driver.findElement(By.xpath("//ol[@id='amt8']"));
	Actions actions3=new Actions(driver);
	actions3.dragAndDrop(s3, d3).perform();
	WebElement txtprint = driver.findElement(By.xpath("//div[@class=\"table4_result\"]"));
	String text = txtprint.getText();
	System.out.println(text);
	
	
	
	
	
	
	
	
	
	
	
	
	
	//driver.close();
}
}
