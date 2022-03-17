package org.browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableDemo 
{
	public static void main(String[] args) 
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinot\\eclipse-workspace\\SelDemo\\src\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	driver.manage().window().maximize();
	
	WebElement webTable = driver.findElement(By.xpath("//div[@class=\"w3-white w3-padding notranslate w3-padding-16\"]"));
	List<WebElement> tblData = webTable.findElements(By.tagName("td"));
	
	int tblDataSize = tblData.size();
	System.out.println("Data Size :  "+tblDataSize);
	
	System.out.println("Print Alternative Data");
	
    for(int i=0;i<tblDataSize;i=i+2) 
    	
       {
    	
    	WebElement data = tblData.get(i);
    	String text = data.getText();
    	System.out.println(text);
    	
       }
	
    }
	
}	

	

	
	

	
	
	
	
	
	
	
	
	
	
	
	

