package MultiBrowserCrossBrowserParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserTest 
{
	public WebDriver driver ;

	@Parameters("Browser")
	@BeforeClass
	public void beforeTest(String browser)
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "G:\\JAVA SETUP\\BrowsersDriver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "G:\\JAVA SETUP\\BrowsersDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		driver.get("https://www.linkedin.com/");
	}

	@Test
	public void login()
	{
		driver.findElement(By.id("login-email")).sendKeys("hitmanbrock@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("88asharma88");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.id("nav-settings__dropdown-trigger"));
		driver.findElement(By.xpath("html/body/nav/div/ul[1]/li[6]/div/ul/li[4]/ul/li/a")).click();
	}

	@AfterClass
	public void afterTest()
	{
		driver.quit();
	}
}
