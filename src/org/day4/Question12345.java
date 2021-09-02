package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question12345 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumRevision\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//Question 1 and  5
		driver.get("http://www.greenstechnologys.com ");
		String t5 = driver.findElement(By.xpath("(//p[@style='text-align:justify; font-size:18px;'])[1]")).getText();
		System.out.println("Question5 Output: \n\n"+t5);
		String t1 = driver.findElement(By.xpath("//u[text()='Greens Technologys Software Training Centers in Chennai']")).getText();
		System.out.println("Question1 Ouput\n\n "+t1);
		driver.get(" http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
//Question2 and 3 and 4
		driver.findElement(By.xpath("//a[@id='home-tab']")).click();
		String t2 = driver.findElement(By.xpath("//p[contains(text(),'currently ')]")).getText();
		System.out.println("Question2:\n"+t2);
		driver.get(" http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		String t3 = driver.findElement(By.xpath("(//div[@class='col-md-3 short-desc-with-logo widget widget_text'])[1]")).getText();
		System.out.println("\n\nGreen Adayar Address:\n"+t3);
		driver.get(" http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		String t4 = driver.findElement(By.xpath("(//div[@class='col-md-3 short-desc-with-logo widget widget_text'])[2]")).getText();
		System.out.println("\n\nGreen OMR Address:\n"+t4);
		
		
	
		
	}

}
