package com.testcases;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProgram {
	public static void main(String args[])

	{

		//Step 1 - Set the location of the browser utils exe in the program

		

		System.setProperty("webdriver.chrome.driver", "./BrowserUnits/chromedriver.exe");

		

		

		//Step 2 - Create an object for Chrome driver wiht respect to WebDriver interface

		

		WebDriver driver = new ChromeDriver();



}
}
