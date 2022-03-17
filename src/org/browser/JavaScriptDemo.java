package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinot\\eclipse-workspace\\SelDemo\\src\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement txtUsername = driver.findElement(By.id("email"));
	JavascriptExecutor executor=(JavascriptExecutor)driver;
	executor.executeScript("arguments[0].setAttribute('value', 'kani')",txtUsername);
	Object name = executor.executeScript("return arguments[0].getAttribute('value')",txtUsername );
	System.out.println(name);
	WebElement txtPassword = driver.findElement(By.id("pass"));
	executor.executeScript("arguments[0].setAttribute('value', 'Hello123@')", txtPassword);
	Object password = executor.executeScript("return arguments[0].getAttribute('value')", txtPassword);
	System.out.println(password);
	WebElement btnLogin = driver.findElement(By.name("login"));
	executor.executeScript("arguments[0].click()", btnLogin);
}
}
