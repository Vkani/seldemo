package org.browser;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	public class DropdwnDemo {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinot\\eclipse-workspace\\SelDemo\\src\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		Thread.sleep(1000);
		WebElement txtUsername = driver.findElement(By.id("username"));
		txtUsername.sendKeys("naveen53");
		Thread.sleep(1000);
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("C1IZAU");
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		
		WebElement dDnLocation = driver.findElement(By.id("location"));
		Select select=new Select(dDnLocation);
		select.selectByIndex(5);
		
		WebElement dDnHotel = driver.findElement(By.id("hotels"));
		Select select1=new Select(dDnHotel);
		select1.selectByIndex(2);
		
		WebElement dDnRoomType = driver.findElement(By.id("room_type"));
		Select select2=new Select(dDnRoomType);
		select2.selectByIndex(2);
		
		WebElement dDnRoomNo= driver.findElement(By.id("room_nos"));
		Select select3=new Select(dDnRoomNo);
		select3.selectByIndex(2);
		
		WebElement dDnAdult= driver.findElement(By.id("adult_room"));
		Select select4=new Select(dDnAdult);
		select4.selectByIndex(3);
		
		WebElement dDnChild= driver.findElement(By.id("child_room"));
		Select select5=new Select(dDnChild);
		select5.selectByIndex(2);
		
		WebElement btnLogin1 = driver.findElement(By.id("Submit"));
		btnLogin1.click();
		
		WebElement radioBtn = driver.findElement(By.id("radiobutton_0"));
		radioBtn.click();
		
		WebElement btnContinue = driver.findElement(By.id("continue"));
		btnContinue.click();
		
		WebElement txtFirstname = driver.findElement(By.id("first_name"));
		txtFirstname.sendKeys("kani");
		
		WebElement txtlastname = driver.findElement(By.id("last_name"));
		txtlastname.sendKeys("kani");
		
		WebElement txtAddress = driver.findElement(By.id("address"));
		txtAddress.sendKeys("102, thoraipakkam");
		
		WebElement txtCcno = driver.findElement(By.id("cc_num"));
		txtCcno.sendKeys("2365589345674554");
		
		WebElement txtCcType = driver.findElement(By.id("cc_type"));
		Select select6=new Select(txtCcType);
		select6.selectByIndex(2);
		
		WebElement txtCcMonth = driver.findElement(By.id("cc_exp_month"));
		Select select7=new Select(txtCcMonth);
		select7.selectByIndex(3);
		
		WebElement txtCcYear = driver.findElement(By.id("cc_exp_year"));
		Select select8=new Select(txtCcYear);
		select8.selectByIndex(12);
		
		WebElement txtCvv = driver.findElement(By.id("cc_cvv"));
		txtCvv.sendKeys("343");
		
		WebElement btnBook = driver.findElement(By.id("book_now"));
		btnBook.click();
		
		Thread.sleep(7000);
	
		WebElement txtOrderNo = driver.findElement(By.id("order_no"));
		String text = txtOrderNo.getAttribute("value");
		
	System.out.println(text);
}


	}
	
