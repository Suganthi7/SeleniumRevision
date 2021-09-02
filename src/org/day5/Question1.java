package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumRevision\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html ");
		WebElement src1 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		Actions a= new Actions(driver);
		WebElement des1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Thread.sleep(5000);
		a.dragAndDrop(src1, des1).perform();
		WebElement src2 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement des2 = driver.findElement(By.xpath("//ol[@id='amt7']"));
		Thread.sleep(5000);
		a.dragAndDrop(src2, des2).perform();
		WebElement src3 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement des3 = driver.findElement(By.xpath("//ol[@id='loan']"));
		Thread.sleep(5000);
		a.dragAndDrop(src3, des3).perform();
		WebElement src4 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement des4 = driver.findElement(By.xpath("//ol[@id='amt8']"));
		a.dragAndDrop(src4, des4).perform();
		
	}

}
