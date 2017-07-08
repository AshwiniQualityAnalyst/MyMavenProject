package Grouping;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class Grouping2Test
{
	@Test(groups = {"Bus"})
	public void Bus1() 
	{
		System.out.println("Batch Bus - Test Bus 1");
	}
	@Test(groups = {"Bus"})
	public void Bus2() 
	{
		System.out.println("Batch Bus - Test Bus 2");
	}
	@Test(groups = {"Train"})
	public void Train1() 
	{
		System.out.println("Batch Train - Test Train 1");
	}
	@Test(groups = {"Train"})
	public void Train2() 
	{
		System.out.println("Batch Train - Test Train 2");
	}
	@Test(groups = {"Bike" , "SedanCar"})
	public void Bike1() 
	{
		System.out.println("Batch Bike - Test Bike 1");
	}
}
