package com.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorExample {
	public static void main(String args[]) throws AWTException, InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "./BrowserUnits/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//we use execute script method to inject javascript on the webpage
		//To scroll down the page
		js.executeScript("window.scrollBy(0,800)","");
		//To scroll up the page
		js.executeScript("window.scrollBy(0,-400)","");
		WebElement ScrollLink = driver.findElement(By.xpath("//a[text()='Hovers']"));
		//To scroll to the element which is display on screen
		js.executeScript("arguments[0].scrollIntoView()",ScrollLink);
		
		
		
		
}
}
