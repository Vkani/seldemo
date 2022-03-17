package org.browser;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinot\\eclipse-workspace\\SelDemo\\src\\Driver\\chromedriver.exe ");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	WebElement altxtbox = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	altxtbox.click();
	WebElement altMsg = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
	altMsg.click();
	Alert al=driver.switchTo().alert();
	al.sendKeys("kani");
	Thread.sleep(1000);
	String text=al.getText();
	System.out.println(text);
	al.accept();
	driver.close();
}
}
