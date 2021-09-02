package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question34567 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumRevision\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
////Question3		
	     driver.get(" http://greenstech.in/selenium-course-content.html");
//	     driver.findElement(By.xpath("//h2[@class='title mb-0 center']")).click();
//		WebElement ctsQus = driver.findElement(By.xpath("//a[text()='CTS Interview Question '] "));
//		a.contextClick(ctsQus).perform();
		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//	Thread.sleep(5000);
////Question4		
//		WebElement frameWork = driver.findElement(By.xpath("(//h2[@class='mb-0'])[6]"));
//    	a.contextClick(frameWork).perform();
//		for (int i = 0; i <= 8; i++) {
//			r.keyPress(KeyEvent.VK_DOWN);
//			r.keyRelease(KeyEvent.VK_DOWN);
//		}
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//       Thread.sleep(5000);
////Question5
//     WebElement modelResume = driver.findElement(By.xpath("(//h2[@class='mb-0'])[2]"));
//       modelResume.click();
//       WebElement modelResume4 = driver.findElement(By.xpath("//a[text()='Resume Model-4 ']"));
//       a.contextClick(modelResume4).perform();
//       r.keyPress(KeyEvent.VK_TAB);
//       r.keyRelease(KeyEvent.VK_TAB);
//       for (int i = 0; i <4 ; i++) {
//		
//	
//      r.keyPress(KeyEvent.VK_DOWN);
//       r.keyRelease(KeyEvent.VK_DOWN);
//		
//       }
//       r.keyPress(KeyEvent.VK_ENTER);
//       r.keyRelease(KeyEvent.VK_ENTER);
//       Thread.sleep(5000);
////Question6       
       WebElement rpa = driver.findElement(By.xpath("//a[@title='RPA Training in chennai']"));
       a.contextClick(rpa).perform();
       for (int i = 0; i < 6; i++) {
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
       }
       r.keyPress(KeyEvent.VK_ENTER);
       r.keyRelease(KeyEvent.VK_ENTER);
//Question7       
       driver.findElement(By.xpath("(//h2[@class='mb-0'])[5]")).click();
    
	   for (int i = 0; i < 6; i++) {
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
	}
 r.keyPress(KeyEvent.VK_ENTER);
 r.keyRelease(KeyEvent.VK_ENTER);
	

}
}