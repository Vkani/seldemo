package org.browser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClassDemo {
 WebDriver driver;
//1.
public void loadurl(String url) {
	driver.get(url);
}
//2.
public void contextClick1(WebElement element) {
	
Actions actions=new Actions(driver);
actions.contextClick();
}
//3.
public void doubleclick(WebElement element) {
WebElement element1=driver.findElement(By.id("attributevalue"));	
Actions actions=new Actions(driver);
actions.doubleClick(element1).perform();
}
//4.
//public WebElement dragDrop(WebElement element,WebElement element1) {
//   Actions actions=new Actions(driver);
//    actions.dragAndDrop(element, element1).perform();
//	return element1;
//}

//6.
public void keyPress(String text) throws AWTException {
Robot robot=new Robot();
//robot.keyPress(KeyEvent.text);
//robot.keyRelease(KeyEvent.text);
}
//7.
public void accept(WebElement element) {
	Alert al=driver.switchTo().alert();
	al.accept();

}
//8.
public void quit(WebElement element) {
	driver.quit();

}
//9.
public void SelectByIndex(WebElement element,int index) {
Select select=new Select(element);
select.selectByIndex(index);
}
//10.
public void selectByAttributeValue(WebElement element, String attributevalue) {
	Select select=new Select(element);
select.selectByValue(" ");
}
//11.
public void selectOptionByText(WebElement element,String text) {
	Select select=new Select(element);
select.selectByVisibleText(" ");
}
//12.
public void selectFirst(WebElement element,String text) {
	Select select=new Select(element);
WebElement element1=select.getFirstSelectedOption();
}
//13.
public List<WebElement> selectAll(WebElement element,String text) {
	Select select=new Select(element);
List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
return allSelectedOptions;
}
//14.
public boolean isMultiple(WebElement element) {
	Select select=new Select(element);
boolean multipledropdwn = select.isMultiple();
return multipledropdwn;
}
//15.
public void deSelectByIndex(WebElement element,int index) {
	Select select=new Select(element);
	select.deselectByIndex(index);	}
//16.
public void deselectByVisible(WebElement element,String text) {
	Select select=new Select(element);
select.deselectByVisibleText(text);
}
//17.
public void deSelectAll( WebElement element) {
	Select select=new Select(element);
select.deselectAll();
}
//18.
//public int Options(List<WebElement>) {
	//Select select=new Select(element);
//List<WebElement> options = select.getOptions();
//int size = options.size();
//return size;
//}
//19.
public void typeJS() {
	JavascriptExecutor executor=(JavascriptExecutor)driver;
//executor.executeScript("arguments[0].setAtrribute('value'+text+" args)",element;
}
//20.
public String getText(WebElement element) {
	String text = element.getText();
return text;
}
//21.
public String getTitle() {
	String title = driver.getTitle();
	return title;
}
//22.
public WebElement findLocatorById(String Attributevalue) {
	WebElement locatorId = driver.findElement(By.id(" "));
return locatorId;
}
//23.
public WebElement findLocatorByName(String AttributeValue) {
	WebElement locatorName = driver.findElement(By.name(""));
return locatorName;
}
//24.
public WebElement findByXpath(String xpath) {
	WebElement findElement = driver.findElement(By.xpath("xpath"));
return findElement;
}
//25.
public String getCurrentUrl() {
	String currentUrl = driver.getCurrentUrl();
return currentUrl;
}
//26.
public void sendKeys(WebElement element,String text) {
	element.sendKeys(text);
	
}
//27.
public void getDriver() {
	WebDriverManager.Chromedriver().setup();
	
}
//28.
public String getAttribute(WebElement element) {
	String attribute = element.getAttribute("");
	return attribute;
	}
//29.
public String getAttributeValue(WebElement element,String attributeName) {
	String attribute = element.getAttribute("");
	return attribute;
}
//30.
public String GetParentId() {
	String windowHandle = driver.getWindowHandle();
	return windowHandle;

}
//31.
public Set<String> GetAllWindowId() {
	Set<String> windowHandles = driver.getWindowHandles();
	return windowHandles;
}
//32.
public boolean driver(String element) {
	boolean equals = driver.equals(element);
	return equals;
}
//33.
public String toString() {
	String string = driver.toString();
	return string;
}
//34.
public void wa() throws InterruptedException {
	driver.wait();
	}
//35.
public String tag(String element) {
	String pageSource = driver.getPageSource();
	return pageSource;

}
//36.
public WebElement clear(WebElement element) {
	WebElement findElement = driver.findElement(By.id(""));
	findElement.click();
	return findElement;
}
//37.
public WebElement enabled() {
	WebElement findElement = driver.findElement(By.id(""));
	findElement.isEnabled();
	return findElement;
}
//38.
public void navigate(String url) {
	driver.navigate().to("url");
	}
//39.
public void navigateBack(String url) {
	driver.navigate().back();
	}
//40.
public void navigateForward() {
	driver.navigate().forward();
	}











}

