package org.day4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question10and11and12 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumRevision\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//Questio10		
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("sanitizer");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		
//Question11
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		WebElement txtUser = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		txtUser.sendKeys("Greens");
		String s1 = txtUser.getAttribute("value");
		System.out.println(s1);
		WebElement txtPass = driver.findElement(By.xpath("//input[@type='password']"));
		txtPass.sendKeys("12345");
		String s2 = txtPass.getAttribute("value");
		System.out.println(s2);
		Thread.sleep(5000);
//Quetsion12
		driver.get(" https://www.shopclues.com/wholesale.html ");
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Mask");
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		
	}

}
