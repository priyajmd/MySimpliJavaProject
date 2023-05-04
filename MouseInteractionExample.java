package com.testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseInteractionExample {
	public static void main(String args[])
	{
	
	System.setProperty("webdriver.chrome.driver", "./BrowserUnits/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://the-internet.herokuapp.com/");
	
	
	WebElement link1 = driver.findElement(By.xpath("//a[text()='A/B Testing']"));
	
	//Step 1 is to crete a object for Actions class with respect the driver, Actions class is used to perform mouse interactions
	
	Actions a1 = new Actions(driver);
	
	//Step 2 is to perform the click action on the element by moving to the element
	
	a1.moveToElement(link1).click().perform();
driver.navigate().back();
	
	//To Perform Hover action
	
	a1.moveToElement(link1).build().perform();
	
	//To Perform right click option
	
	a1.moveToElement(link1).contextClick().build().perform();

	
	
	}

}
