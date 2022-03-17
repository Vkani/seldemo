package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vinot\\eclipse-workspace\\SelDemo\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement btnclick = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		btnclick.click();
		WebElement txtFirstname = driver.findElement(By.name("firstname"));
		txtFirstname.sendKeys("Kani");

		// driver.quit();
	}

}
