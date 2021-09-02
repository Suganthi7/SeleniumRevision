package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question6789and10 {public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumRevision\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Actions a=new Actions(driver);
//Question6	
	driver.get("http://greenstech.in/selenium-course-content.html");
	WebElement btnCOurse = driver.findElement(By.xpath("//div[text()='Courses ']"));
	a.moveToElement(btnCOurse).perform();
	WebElement softCourse = driver.findElement(By.xpath("//span[text()='Software Testing (12)']"));
	a.moveToElement(softCourse).perform();
	 WebElement t1 = driver.findElement(By.xpath("//span[text()='Selenium Certification Training']"));
	 String t1Text = t1.getText();
	 System.out.println(t1Text);
	 t1.click();
//Question7	 
	 
	     a.moveToElement(btnCOurse).perform();
	     WebElement oracleCourse = driver.findElement(By.xpath("//span[text()='Oracle (48)']"));
		a.moveToElement(oracleCourse).perform();
		 WebElement t4 = driver.findElement(By.xpath("//span[text()='SQL Certification Training']"));
		 String t4Text = t4.getText();
		 System.out.println(t4Text);
		 t4.click();
	 
//Question8and10	 
	 
	 a.moveToElement(btnCOurse).perform();
	 WebElement dataCourse = driver.findElement(By.xpath("//span[text()='Data Warehousing (5)']"));
		a.moveToElement(dataCourse).perform();
		 WebElement t2 = driver.findElement(By.xpath("//span[text()='DataStage Certification Training']"));
		 String t2Text = t2.getText();
		 System.out.println(t2Text);
		 t2.click();
//Question9	
		 a.moveToElement(btnCOurse).perform();
		 WebElement rpa = driver.findElement(By.xpath("//span[text()='RPA (6)']"));
		 a.moveToElement(rpa).perform();
		 WebElement t3 = driver.findElement(By.xpath("//span[text()='Blue Prism Certification Training']"));
		 String t3Text = t3.getText();
		 System.out.println(t3Text);
		 t3.click();
		 

	
}

}
