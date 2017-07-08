package WindowHandles;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SwitchingBetweenTest 
{
	private static WebDriver driver ;
	
	@Test
	public void test () throws InterruptedException
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.salesforce.com/in/?ir=1");
		driver.findElement(By.xpath("html/body/header/div[2]/div/div[1]/div/div/div[2]/nav/div[1]/div/div[2]/div[2]/div/div/a/span")).click();
		driver.findElement(By.xpath("html/body/header/div[2]/div/div[1]/div/div/div[2]/nav/div[2]/div/div[1]/div/div/a/span")).click();
		// Get and store both window handles in array
		Set<String> AllWindowHandles = driver.getWindowHandles();
		String window3Main = (String) AllWindowHandles.toArray()[0];
		System.out.print("window3 handle code = "+AllWindowHandles.toArray()[0]);
		String window1TryItFree = (String) AllWindowHandles.toArray()[1];
		System.out.print("window1 handle code = "+AllWindowHandles.toArray()[1]);
		String window2ContactMe = (String) AllWindowHandles.toArray()[2];
		System.out.print("window2 handle code = "+AllWindowHandles.toArray()[2]);
		
		
		//Switch to window2(child window) and performing actions on it.
		driver.switchTo().window(window2ContactMe);
		driver.findElement(By.id("UserFirstName")).sendKeys("SalesForce");
		driver.findElement(By.id("UserLastName")).sendKeys("SalesForce");
		
		//Switch to window1(parent window) and performing actions on it.
		driver.switchTo().window(window1TryItFree);
		driver.findElement(By.id("UserFirstName")).sendKeys("SalesForce");
		driver.findElement(By.id("UserLastName")).sendKeys("SalesForce");
		
		//Once Again switch to window2(child window) and performing actions on it.
		driver.switchTo().window(window2ContactMe);
		Thread.sleep(5000);
		driver.close();
		
		//Once Again switch to window1(parent window) and performing actions on it.
		driver.switchTo().window(window1TryItFree);
		Thread.sleep(5000);
		driver.close();
		
		driver.switchTo().window(window3Main);
		Thread.sleep(5000);
		driver.close();
	}

}
