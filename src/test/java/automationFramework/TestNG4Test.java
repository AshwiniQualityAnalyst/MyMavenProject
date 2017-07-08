package automationFramework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class TestNG4Test 
{
	public WebDriver driver ;
	@Test
	public void LinkedINLogInLogOut() 
	{
		System.out.println("Ashwini Sharma");
		driver.findElement(By.id("login-email")).sendKeys("hitmanbrock@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("88asharma88");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.id("nav-settings__dropdown-trigger"));
		driver.findElement(By.xpath("html/body/nav/div/ul[1]/li[6]/div/ul/li[4]/ul/li/a")).click();

	}
	@BeforeMethod
	public void beforeMethod() 
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.linkedin.com/");
	}
	@AfterMethod
	public void afterMethod() 
	{
		driver.quit();
	}
}
