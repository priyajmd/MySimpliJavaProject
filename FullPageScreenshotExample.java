package com.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullPageScreenshotExample {
	public static void main(String args[]) throws AWTException, InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "./BrowserUnits/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com");

}
}