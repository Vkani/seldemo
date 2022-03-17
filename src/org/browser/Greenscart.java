package org.browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greenscart {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vinot\\eclipse-workspace\\SelDemo\\src\\Driver\\chromedriver.exe ");
	WebDriver driver=new ChromeDriver();
	driver.get("http://greenscart.in/#/login?returnUrl=%2F");
	//driver.manage().window().maximize();
	Thread.sleep(1000);
	WebElement lgnUser = driver.findElement(By.id("loginEmailId"));
	lgnUser.sendKeys("kani.banu07@gmail.com");
	WebElement lgnPass = driver.findElement(By.id("loginPassword"));
	lgnPass.sendKeys("123Vk@ni");
	WebElement btnLogin = driver.findElement(By.xpath("//input[@style=\"width: 90%;\"]"));
	btnLogin.click();
	Thread.sleep(1000);
	WebElement txtsearch = driver.findElement(By.xpath("//a[text()='MOBILE']"));
	txtsearch.click();
	Thread.sleep(2000);
	WebElement imgSelect = driver.findElement(By.xpath("//img[@src=\"https://www.reliancedigital.in/medias/Apple-iPhone12-Mini-Smartphones-491901543-i-1-1200Wx1200H?context=bWFzdGVyfGltYWdlc3wxMTQ0MjF8aW1hZ2UvanBlZ3xpbWFnZXMvaGVkL2gzNy85Njc1ODY4MzA3NDg2LmpwZ3wxMzU1NDZhZDkzNTk5OTM2OTdlZjZjYTZiODQ2ZDhmOWYzMTA0ZTNiYjg2OGM3ZWVhNDc1MjkwMDQ2ZTkwNGVm\"]"));
	imgSelect.click();
	Thread.sleep(1000);
	WebElement btnBuy = driver.findElement(By.xpath("//button[text()='Buy Now']"));
	btnBuy.click();
	Thread.sleep(2000);
	WebElement btnGift = driver.findElement(By.xpath("//button[text()='ADD GIFT CODE']"));
	btnGift.click();
	Thread.sleep(2000);
	Actions action = new Actions(driver);
	WebElement dblClick = driver.findElement(By.xpath("//span[text()='GRN10']"));
	Thread.sleep(2000);
	action.doubleClick(dblClick).perform();
	Thread.sleep(1000);
	action.contextClick(dblClick).perform();
	Thread.sleep(1000);
	WebElement btnRemove = driver.findElement(By.xpath("//div[text()='Remove Promo Code ']"));
	btnRemove.click();
}
}
