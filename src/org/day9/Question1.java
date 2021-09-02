package org.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question1 
{

	  public static WebDriver driver;
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumRevision\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	public static  void optSelect(WebElement ele) {
		Select s=new Select(ele);
		
		
		
		

	}

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		//Question1and 2 Non select class
//		driver.get("http://demoqa.com/automation-practice-form/");
//		WebElement selState = driver.findElement(By.xpath("//label[text()='State and City']"));
//Question3
		driver.get(" https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(5000);
		WebElement selYear = driver.findElement(By.xpath("//select[@id='year']"));
		optSelect(selYear);
		List<WebElement>  alloptions = s.getOptions();
		for (WebElement each : alloptions) {
			System.out.println(each.getText());
		}
		
		
		String attribute = selYear.getAttribute("value");
		System.out.println(attribute);
		WebElement selMon = driver.findElement(By.xpath("//select[@id='month']"));
		Thread.sleep(5000);
		optSelect(selMon);
		
		
		

	}

}
