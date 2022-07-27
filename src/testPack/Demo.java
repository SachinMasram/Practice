package testPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class Demo");
	}

	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before Method Demo");
	}
	
	@Test
	public void test()
	{
		System.out.println("Test Demo");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test2 Demo");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After Method Demo");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class Demo");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
