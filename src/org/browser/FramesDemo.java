package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vinot\\eclipse-workspace\\SelDemo\\src\\Driver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/guru99home/");

	
	WebElement img = driver.findElement(By.xpath("//img[@src=\"../img/logo.png\"]"));
	driver.switchTo().frame(img);
	String text = img.getText();
	System.out.println(text);
	
	
	
	
	
	
	
	
	
	
}
}
