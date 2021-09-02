package org.day4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question6789 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumRevision\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//Question6
		//driver.get("https://www.facebook.com/");
		//WebElement txtEmail = driver.findElement(By.xpath("//input[@id='email']"));
		//txtEmail.sendKeys("Greens");
		//String s1 = txtEmail.getAttribute("value");
		//System.out.println(s1);
		//WebElement txtPass = driver.findElement(By.xpath("//input[@id='pass']"));
		//txtPass.sendKeys("12345");
		//String s2 = txtPass.getAttribute("value");
		//System.out.println(s2);
		//Thread.sleep(5000);
//Question7
		//driver.get(" http://www.google.com/");
		//driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Velmurugan");
		//Robot r=new Robot();

		//r.keyPress(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_ENTER);
		//Thread.sleep(5000);
		
//Question8
		driver.get("http://adactinhotelapp.com/");
		WebElement txtUser = driver.findElement(By.xpath("//input[@id='username']"));
		txtUser.sendKeys("renurenu");
		String s3 = txtUser.getAttribute("value");
		System.out.println(s3);
		WebElement txtPass1 = driver.findElement(By.xpath("//input[@id='password']"));
		Thread.sleep(5000);
		txtPass1.sendKeys("12345");
		String s4 = txtPass1.getAttribute("value");
		System.out.println(s4);
		Thread.sleep(5000);
		
//Question9
		driver.get(" https://www.snapdeal.com/ ");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@name='keyword'])[1]")).sendKeys("Dress");
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		
	}

}
