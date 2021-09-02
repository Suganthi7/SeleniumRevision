package org.day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.remote.server.handler.GetScreenOrientation;

public class Questions
 {
	  public static WebDriver driver;
	  public static TakesScreenshot tk;
	  public static JavascriptExecutor js;
	  public static Actions a;
	  
	public static void getScreen(String name) throws IOException {
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\admin\\eclipse-workspace\\SeleniumRevision\\Screenshot1\\"+name+".png");
    	FileUtils.copyFile(src, des);
		

	}
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumRevision\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		 tk=(TakesScreenshot)driver;
		 js=(JavascriptExecutor)driver;
	}
	

public static void main(String[] args) throws IOException, InterruptedException {
		
		
		
//Question1 and 4
		setUp();
		driver.get(" http://www.greenstechnologys.com/");
    	getScreen("Question1");
		WebElement greenPerumbkm = driver.findElement(By.xpath("//span[text()='Greens technology Perumbakkam']"));
		Thread.sleep(5000);
		js.executeScript("arguments[0].scrollIntoView(true)", greenPerumbkm);
		getScreen("Quetsion4");
		
		
//Question2
		driver.get("http://toolsqa.com/");
	    WebElement recentArticle = driver.findElement(By.xpath("//span[text()='Recent Articles']"));
		Thread.sleep(5000);
		js.executeScript("arguments[0].scrollIntoView(true)", recentArticle);
		getScreen("Question2");
//Question3		
		WebElement selTraining = driver.findElement(By.xpath("//span[text()='Selenium Training Benefit']"));
	    Thread.sleep(5000);
		js.executeScript("arguments[0].scrollIntoView(true)", selTraining);
		Thread.sleep(5000);
		getScreen("Question3Down");
		String text = (String)js.executeScript("return arguments[0].getAttribute('text')", selTraining);
		Thread.sleep(5000);
		getScreen("Question3Up");
		System.out.println(text);
		
//Question5
		driver.get(" http://greenstech.in/selenium-course-content.html");
		WebElement jobOpng = driver.findElement(By.xpath("//div[@id='heading2011']"));
		Thread.sleep(5000);
		js.executeScript("arguments[0].scrollIntoView(true)", jobOpng);
		getScreen("Question5");
		Thread.sleep(5000);
		WebElement onlineClass = driver.findElement(By.xpath("//h3[text()='Online Classroom']"));
		js.executeScript("arguments[0].scrollIntoView(false)", onlineClass);
//Question6
		WebElement topSel = driver.findElement(By.xpath("(//h3[@title='Top Selenium Trends In 2020'])[2]"));
		js.executeScript("arguments[0].scrollIntoView(true)", topSel);
		getScreen("Question6");
//Question7	
		driver.get(" http://greenstech.in/selenium-course-content.html");
		Thread.sleep(5000);
		 driver.findElement(By.xpath("//div[@id='heading20']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//div[@id='heading2011']")).click();
		 getScreen("Question7");
//Question8
		driver.get(" http://greenstech.in/selenium-course-content.html");
		driver.findElement(By.xpath("//div[@id='heading302']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='heading303']")).click();
		getScreen("Question8");
//Question9	
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		getScreen("Question9");
		a=new Actions(driver);
		Thread.sleep(5000);
		driver.get("https://www.flipkart.com/");
		WebElement fashin = driver.findElement(By.xpath("//div[text()='Fashion']"));
		a.moveToElement(fashin).perform();
		getScreen("Question9a");
//Question11		
		WebElement kid = driver.findElement(By.xpath("//div[text()='Beauty, Toys & More']"));
		a.moveToElement(kid).perform();
		getScreen("Question11");
//Question10		
		driver.get(" https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("motorola");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		getScreen("Queetion10");
//Question12		
		driver.get(" https://www.snapdeal.com/");
		driver.findElement(By.xpath("//input[@name='keyword']")).sendKeys("HP laptop");
		driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']")).click();
		getScreen("Question12");
	
		
	}

}
