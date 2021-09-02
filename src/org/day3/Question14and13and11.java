package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question14and13and11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumRevision\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("987654332");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Greens");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("greentechnology@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
		Thread.sleep(5000);
		//Question13
		driver.get(" https://www.myntra.com/register?referer=https://www.myntra.com");
		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("1234567");
		driver.findElement(By.xpath("//div[text()='CONTINUE']")).click();
		Thread.sleep(5000);
		//Question11
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Green");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Technology");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("greentechnology@gmail.com");
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("12345");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
				
		
	}

}
