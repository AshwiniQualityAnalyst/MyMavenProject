package Grouping;

import org.testng.annotations.Test;

public class DependentTest 
{
	@Test(dependsOnMethods = {"OpenBrowser"})
	public void SignIN()
	{
		System.out.println("This will execute second (SignIn)");
	}
	@Test
	public void OpenBrowser()
	{
		System.out.println("This will execute first (Open Browser)");
	}
	@Test(dependsOnMethods = {"SignIN"})
	public void LogOut()
	{
		System.out.println("This will execute third (Log Out)");
	}
}
