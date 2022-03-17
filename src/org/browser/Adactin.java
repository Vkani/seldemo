package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vinot\\\\eclipse-workspace\\\\SelDemo\\\\src\\\\Driver\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	WebElement txtwelcome = driver.findElement(By.xpath("//p[contains(text(),'Adactin Launches')]"));
String text = txtwelcome.getText();
System.out.println(text);
//close();



}
}
