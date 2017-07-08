package com.selenium.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HelloWorldTest 
{
	@Test
	public void Login()
	{
		System.out.println("Äshwini sharma-Maven");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
	}
}
