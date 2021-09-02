package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question13and14 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumRevision\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//Question13		
		driver.get(" https://www.snapdeal.com/");
		WebElement women = driver.findElement(By.xpath("(//span[@class='catText'])[6]"));
		Actions a=new Actions(driver);
		a.moveToElement(women).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='Footwear'])[1]")).click();
		Thread.sleep(5000);
//Question14		
		driver.get(" https://www.snapdeal.com/");
		WebElement mobile = driver.findElement(By.xpath("//span[text()='Sports, Fitness & Outdoor']"));
		
		a.moveToElement(mobile).perform();
		driver.findElement(By.xpath("//span[text()='Gym Gloves']")).click();
	}

}
