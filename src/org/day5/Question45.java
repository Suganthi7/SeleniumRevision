package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question45 {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumRevision\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
//Question4	
	driver.get("https://www.shopclues.com/wholesale.html");
	Actions a=new Actions(driver);
	WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles & More']"));
	a.moveToElement(mobile).perform();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[text()='Realme']")).click();
//Question5	
	
	WebElement sports = driver.findElement(By.xpath("//a[text()='Sports & More']"));
	a.moveToElement(sports).perform();
	driver.findElement(By.xpath("//a[text()='Weight Gainers']")).click();

}}
