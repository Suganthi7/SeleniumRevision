package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1to10 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumRevision\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//Question1
	driver.get("https://en-gb.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("Greens");
	driver.findElement(By.id("pass")).sendKeys("123456");
	driver.findElement(By.name("login")).click();
//Question2	
	Thread.sleep(10000);
	driver.get(" https://www.redbus.in/ ");
	driver.findElement(By.id("src")).sendKeys("chennai");
	driver.findElement(By.id("dest")).sendKeys(" Madurai");
//Question3	
	Thread.sleep(10000);
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("Greens Technology");
	Thread.sleep(10000);
//Question4	
	//driver.get(" https://infinity.icicibank.com/corp/Login.jsp");
	//driver.findElement(By.id("HDisplayDefault.Rb14.C3")).click();
	//driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL")).sendKeys("Greens");
//Question5	
	
	//driver.get(" https://netbanking.hdfcbank.com/ ");
	//driver.findElement(By.name("fldLoginUserId")).sendKeys("Greens");
	Thread.sleep(10000);
//Question6	
	driver.get(" https://www.swiggy.com");
	driver.findElement(By.id("location")).sendKeys("chennai");
	Thread.sleep(10000);
//Question7
	driver.get("https://www.snapdeal.com/login");
	driver.findElement(By.id("userName")).sendKeys("987654321");
	Thread.sleep(10000);
//Question8
	//driver.get("https://www.instagram.com/accounts/login/?hl=en) login page ");
	//driver.findElement(By.name("username")).sendKeys("Greens");
	//driver.findElement(By.name("password")).sendKeys("12345");
	Thread.sleep(10000);
//Question9
	//driver.get(" http://adactinhotelapp.com/");
	//driver.findElement(By.id("username")).sendKeys("Greens");
	//driver.findElement(By.id("password")).sendKeys("12345");
	//driver.findElement(By.id("login")).click();

//Question10
	driver.get(" http://adactinhotelapp.com/");
	driver.findElement(By.id("username")).sendKeys("Greens");
	driver.findElement(By.id("password")).sendKeys("12345");
	driver.findElement(By.id("login")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
