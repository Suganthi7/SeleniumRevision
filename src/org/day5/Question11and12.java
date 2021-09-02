package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question11and12 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\SeleniumRevision\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.homedepot.com/");
		WebElement allDep = driver.findElement(By.xpath("//a[text()='All Departments']"));
		Actions a= new Actions(driver);
		a.moveToElement(allDep).perform();
		Thread.sleep(5000);
		WebElement electrical = driver.findElement(By.xpath("(//a[@class='MainFlyout__link'])[10]"));
		a.moveToElement(electrical).perform();
		Thread.sleep(5000);
	     WebElement home = driver.findElement(By.xpath("(//a[text()='Home Safety and Security'])[1]"));
	     a.moveToElement(home).perform();
	     WebElement t1 = driver.findElement(By.xpath("//a[text()='Child Safety']"));
	     String t1Text = t1.getText();
	     System.out.println(t1Text);
	     t1.click();
//Questio12
		Thread.sleep(5000);
		WebElement allDep1 = driver.findElement(By.xpath("//a[text()='All Departments']"));
		a.moveToElement(allDep1).perform();
		Thread.sleep(5000);
		WebElement cool = driver.findElement(By.xpath("(//a[@class='MainFlyout__link'])[11]"));
		a.moveToElement(cool).perform();
		Thread.sleep(5000);
	 WebElement airCondn = driver.findElement(By.xpath("(//a[text()='Air Conditioners'])[1]"));
	 a.moveToElement(airCondn).perform();
	 WebElement porAir = driver.findElement(By.xpath("//a[text()='Portable Air Conditioners']"));
	 String t2 = porAir.getText();
	 System.out.println(t2);
	 Thread.sleep(5000);
	 porAir.click();
	 
		
		
		
	}
}
