package com.testcases;
import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;



public class SeleniumWaitsExample {
	public static void main(String args[]) throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.chrome.xcepdriver", "./BrowserUnits/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	
	WebElement startButton = driver.findElement(By.xpath("//button[text()='Start']"));
	
	startButton.click();
	
	//Impicity wait
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement HelloWorldText = driver.findElement(By.xpath("(//h4)[2]"));
	
	System.out.println(HelloWorldText.getText());
	driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading/2");
	
	driver.navigate().refresh();
	
	WebElement startButton1 = driver.findElement(By.xpath("//button[text()='Start']"));
	
	startButton1.click();
	
	//Explicit Wait Example
	WebElement HelloWorldText1 = driver.findElement(By.xpath("(//h4)[2]"));
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
	wait.until(ExpectedConditions.visibilityOf(HelloWorldText1));
	
	System.out.println(HelloWorldText.getText());
	//Fluent wait example
	
			Wait<WebDriver> fluentWait = new FluentWait<WebDriver> (driver)
					.withTimeout(Duration.ofSeconds(30))
					.pollingEvery(Duration.ofSeconds(5));
			
			Thread.sleep(10000);
			
			System.out.println("Printing syso after 10 seconds");




}}
