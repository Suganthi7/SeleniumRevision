package org.day5;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question2and15and16 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumRevision\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//Question2		
		
		driver.get("http://www.amazon.in");
		Actions a= new Actions(driver);
		WebElement prime = driver.findElement(By.xpath("//a[@id='nav-link-prime']"));
		 a.moveToElement(prime).perform();
	     Thread.sleep(5000);
		 driver.findElement(By.xpath("//img[@id='multiasins-img-link']")).click();
//Question15and16
		 driver.get("http://www.amazon.in");
		 WebElement accList = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		 a.moveToElement(accList).perform();
		 driver.findElement(By.xpath("(//span[text()='Sign in'])[1]")).click();;
		 
			
	}

}
