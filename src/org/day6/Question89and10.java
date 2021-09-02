package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question89and10
{
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumRevision\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//Question8		
		driver.get("https://www.flipkart.com/");
	    Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_G);
//		r.keyRelease(KeyEvent.VK_G);
//		r.keyPress(KeyEvent.VK_R);
//		r.keyRelease(KeyEvent.VK_R);
//		r.keyPress(KeyEvent.VK_E);
//		r.keyRelease(KeyEvent.VK_E);
//		r.keyPress(KeyEvent.VK_E);
//		r.keyRelease(KeyEvent.VK_E);
//		r.keyPress(KeyEvent.VK_N);
//		r.keyRelease(KeyEvent.VK_N);
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_A);
//		r.keyRelease(KeyEvent.VK_A);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_C);
//		r.keyRelease(KeyEvent.VK_C);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_V);
//		r.keyRelease(KeyEvent.VK_V);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		Thread.sleep(5000);
//Quetsion9
		driver.get("https://www.flipkart.com/");
		
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		WebElement gracery = driver.findElement(By.xpath("//div[text()='Grocery']"));
		Actions a=new Actions(driver);
		a.contextClick(gracery).perform();
		for (int i = 0; i < 4; i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
//Question10
//	    driver.get("https://www.amazon.in/");
//		driver.findElement(By.xpath("//span[text()='Account & Lists']")).click();
//		Thread.sleep(5000);
//		r.keyPress(KeyEvent.VK_G);
//		r.keyRelease(KeyEvent.VK_G);
//		r.keyPress(KeyEvent.VK_R);
//		r.keyRelease(KeyEvent.VK_R);
//		r.keyPress(KeyEvent.VK_E);
//		r.keyRelease(KeyEvent.VK_E);
//		r.keyPress(KeyEvent.VK_E);
//		r.keyRelease(KeyEvent.VK_E);
//		r.keyPress(KeyEvent.VK_N);
//		r.keyRelease(KeyEvent.VK_N);
//		Thread.sleep(5000);
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_A);
//		r.keyRelease(KeyEvent.VK_A);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_C);
//		r.keyRelease(KeyEvent.VK_C);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		Thread.sleep(5000);
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_X);
//		r.keyRelease(KeyEvent.VK_X);
//		r.keyRelease(KeyEvent.VK_CONTROL);
		}

}
