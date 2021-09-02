package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question9and12 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumRevision\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//question9
		driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9876543321");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("98776543221");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(5000);
		
		//question12
		driver.get(" https://www.snapdeal.com/");
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		driver.findElement(By.xpath("//a[text()='login']")).click();
		Thread.sleep(5000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='loginIframe']"));
		
		driver.switchTo().frame(frame);
		Thread.sleep(5000);
		WebElement  txt = driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']"));
		
		txt.sendKeys("98765432");
		driver.findElement(By.xpath("(//button[text()='continue'])[1]")).click();
		
	}

}
