package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinot\\eclipse-workspace\\SelDemo\\src\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	WebElement txtFirstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	txtFirstName.sendKeys("Vinoth");
	WebElement txtLastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	txtLastName.sendKeys("Kumar");
	WebElement txtAddress = driver.findElement(By.xpath("//textarea[@rows='3']"));
	txtAddress.sendKeys("1-thoraipakkam,chennai");
	WebElement txtMailId = driver.findElement(By.xpath("//input[@type='email']"));
	txtMailId.sendKeys("kani.cbe90");
	WebElement txtPhoneNo = driver.findElement(By.xpath("//input[@type='tel']"));
	txtPhoneNo.sendKeys("8989897867");
	WebElement txtGender = driver.findElement(By.xpath("//input[@value='Male']"));
	txtGender.click();
	WebElement txtHobby1 = driver.findElement(By.xpath("//input[@id='checkbox1']"));
	txtHobby1.click();
	WebElement txtHobby2 = driver.findElement(By.xpath("//input[@id='checkbox2']"));
	txtHobby2.click();
	WebElement txtHobby3 = driver.findElement(By.xpath("//input[@id='checkbox3']"));
	txtHobby3.click();
	WebElement txtFirstPassword = driver.findElement(By.xpath("//input[@id='firstpassword']"));
	txtFirstPassword.sendKeys("se34");
	WebElement txtSecondPassword = driver.findElement(By.xpath("//input[@id='secondpassword']"));
	txtSecondPassword.sendKeys("se34");
	//WebElement txtLanguage = driver.findElement(By.xpath("//div[@id='msdd']"));
	//txtLanguage.sendKeys("English");
	//driver.close();
}
}
