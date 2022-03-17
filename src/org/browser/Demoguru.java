package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demoguru 
{
public static void main(String[] args) throws InterruptedException 
   {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vinot\\eclipse-workspace\\SelDemo\\src\\Driver\\chromedriver.exe ");
	WebDriver driver=new ChromeDriver();
	driver.get("https://sprint.com");
	driver.manage().window().maximize();
	WebElement lnkPhone = driver.findElement(By.xpath("//a[text()=' Phones & devices ']"));
	Actions actions=new Actions(driver);
	actions.moveToElement(lnkPhone).perform();
	WebElement Clk5G = driver.findElement(By.xpath("//span[text()='5G phones']"));
	Clk5G.click();
	WebElement txtDonot = driver.findElement(By.xpath("//a[text()=' Do Not Sell My Personal Information']"));
	String text = txtDonot.getText();
	System.out.println(text);
   }
}
