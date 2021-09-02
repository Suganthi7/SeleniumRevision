package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question3 {
	public static void main(String[] args) throws InterruptedException {
		//Quetsion3
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumRevision\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions a= new Actions(driver);
				driver.get("https://www.flipkart.com/");
			    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		        WebElement hmeFrn = driver.findElement(By.xpath("(//div[@class='CXW8mj'])[6]"));
		        a.moveToElement(hmeFrn).perform();
		        String sport = driver.findElement(By.xpath("(//div[@class='_3LU4EM'])[4]")).getText();
		        Thread.sleep(5000);
		      System.out.println(sport);
		      
		      //Question20
		      WebElement appliBox = driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[7]"));
		      a.moveToElement(appliBox).perform();
		      driver.findElement(By.xpath("//div[@id='container']")).click();
		      
	}

}
