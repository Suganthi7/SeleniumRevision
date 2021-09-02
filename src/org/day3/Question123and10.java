package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question123and10 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumRevision\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Question1 and10
		driver.get(" https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(" iphone");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(5000);
		//Question2
		driver.get(" https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Greens");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(5000);
		//Question3
		driver.get(" http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Greens");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Techology");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Perumbakkam");
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("greentechnology@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		WebElement cntry = driver.findElement(By.xpath("//select[@id='countries']"));
		Thread.sleep(5000);
		Select s=new Select(cntry);
		Thread.sleep(5000);
		s.selectByVisibleText("India");
		Thread.sleep(5000);
		WebElement year = driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select s1=new Select(year);
		s1.selectByValue("1916");
		Thread.sleep(5000);
		WebElement mnth = driver.findElement(By.xpath("(//select[@type='text'])[4]"));
		Thread.sleep(5000);
		Select s2=new Select(mnth);
		s2.selectByValue("January");
		Thread.sleep(5000);
		WebElement day = driver.findElement(By.xpath("(//select[@type='text'])[5]"));
		Thread.sleep(5000);
		Select s3=new Select(day);
		s3.selectByValue("7");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()=' Submit ']")).click();
		
	}

}
