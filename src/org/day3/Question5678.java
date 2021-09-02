package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question5678 {
	public static void main(String[] args) throws InterruptedException {	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumRevision\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//Question5and 8
	driver.get("http://greenstech.in/selenium-course-content.html");
	driver.findElement(By.xpath("//div[@id='heading20']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//a[@title='Interview Questions'])[6]")).click();
	Thread.sleep(5000);
	driver.get("http://greenstech.in/selenium-course-content.html");
	driver.findElement(By.xpath("(//h2[@class='mb-0'])[2]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//a[@title='Model Resume training in chennai'])[1]")).click();
	
	//question6
	driver.get(" https://www.redbus.in/");
	driver.findElement(By.xpath("//i[@id='i-icon-profile']")).click();
	driver.findElement(By.xpath("//li[@id='signInLink']")).click();
	Thread.sleep(5000);
	WebElement element  = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
	driver.switchTo().frame(element);
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//input[@id='mobileNoInp'])")).sendKeys("987654321");
	Thread.sleep(5000);
	//driver.findElement(By.xpath("(//div[@id='otp-container'])[1]")).click();
	
	
	//Question7
	driver.get("  https://www.cleartrip.com/trains");
	driver.findElement(By.xpath("//input[@title='From station']")).sendKeys("Chennai");
	driver.findElement(By.xpath("//input[@id='to_station']")).sendKeys("Madurai");
	driver.findElement(By.xpath("//button[@id='trainFormButton']")).click();
	Thread.sleep(5000);
	
	}}
