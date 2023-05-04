package com.testcases;
import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpLoadExample {
	public static void main(String args[]) throws AWTException, InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "./BrowserUnits/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		WebElement FileUpload = driver.findElement(By.id("file-upload"));
		
		//FileUpload.click();
		
		Actions a1 = new Actions(driver);
		
	    a1.moveToElement(FileUpload).click().build().perform();
		Thread.sleep(4000);
		//to give the exe file or compile file in the selenium script we have to Runtime method
		Runtime.getRuntime().exec("D:\\evening batch\\FileUpLoad.exe");
		
		
	}


}
