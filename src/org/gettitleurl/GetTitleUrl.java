package org.gettitleurl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class GetTitleUrl {
	public static void main(String[] args) throws InterruptedException {
		//Chrome 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumNew\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		String title = driver.getTitle();
		System.out.println("Chrome Driver\n");
		System.out.println("Title of the page:  "+title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("URL of Page  :"+currentUrl);
		Thread.sleep(5000);
		driver.quit();
		
//FireFOx
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumNew\\Drivers\\geckodriver.exe");
		WebDriver driver1=new  FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("https://en-gb.facebook.com/");
		String title2 = driver1.getTitle();
		System.out.println("FireFox Driver :\n");
		System.out.println("Title of page  :"+title2);
		String currentUrl2 = driver1.getCurrentUrl();
		System.out.println("URL of page  :"+currentUrl2);
		Thread.sleep(5000);
		driver1.quit();
		
//InternetExplorer
		System.setProperty("webdriver.ie.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumNew\\Drivers\\IEDriverServer.exe");
		WebDriver driver3=new InternetExplorerDriver();
		driver3.manage().window().maximize();
		driver3.get("https://en-gb.facebook.com/");
		String title3 = driver3.getTitle();
		System.out.println("Internet Explorer :\n");
		System.out.println("Title of Page :"+title3);
		String currentUrl3 = driver3.getCurrentUrl();
		System.out.println("URL of Page  :"+currentUrl3);
		Thread.sleep(5000);
		driver3.quit();
		
}

}
