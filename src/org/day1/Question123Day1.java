package org.day1;

import org.browserlaunch.InternetExplorer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Question123Day1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumNew\\Drivers\\chromedriver.exe");
		//Question2 
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" http://www.greenstechnologys.com/");
		Thread.sleep(5000);
		
		driver.get(" http://gmail.com/");
		Thread.sleep(5000);
		
		driver.get(" http://www.flipkart.com/");
		Thread.sleep(5000);
		
		driver.get(" http://greenstech.in/selenium-course-content.html");
		Thread.sleep(5000);
		
		Thread.sleep(10000);
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumNew\\Drivers\\IEDriverServer.exe");
		//Question3 
		
		WebDriver driver2=new InternetExplorerDriver();
		driver2.manage().window().maximize();
		
		driver2.get(" http://gmail.com/");
		Thread.sleep(5000);
		
		driver2.get(" http://www.flipkart.com/");
		Thread.sleep(5000);
		
		driver2.get(" http://greenstech.in/selenium-course-content.html");
		Thread.sleep(5000);
		
		Thread.sleep(10000);
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumNew\\Drivers\\geckodriver.exe");
		//Question1 
		
		WebDriver driver1=new FirefoxDriver();
		driver1.manage().window().maximize();
		Thread.sleep(10000);
		driver1.get(" http://www.greenstechnologys.com/");
		Thread.sleep(5000);
		
		driver1.get(" https://www.facebook.com/");
		Thread.sleep(5000);
		
		driver1.get(" https://www.amazon.in");
		Thread.sleep(5000);
		
		driver1.get(" http://greenstech.in/selenium-course-content.html");
		Thread.sleep(5000);
		
		
		
		
		
	}

}
