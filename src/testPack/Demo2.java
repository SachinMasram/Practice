package testPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2 {
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class Demo2");
	}

	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before Method Demo2");
	}
	
	@Test
	public void test()
	{
		System.out.println("Test Demo2");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test2 Demo2");
	}
	
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After Method Demo2");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class Demo2");
	}
	
	
	

}
