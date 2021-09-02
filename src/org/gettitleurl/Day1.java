package org.gettitleurl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Day1 {
	public static void main(String[] args) throws InterruptedException {
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
		
		driver3.get(" http://www.greenstechnologys.com/");
		String title = driver3.getTitle();
		System.out.println("Internet Explorer :\n");
		System.out.println("Title of Page :"+title);
		String currentUrl = driver3.getCurrentUrl();
		System.out.println("URL of Page  :"+currentUrl);
		Thread.sleep(5000);
		driver3.quit();
		
		
	}

}
