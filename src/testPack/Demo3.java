package testPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo3 {
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class Demo3");
	}

	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before Method Demo3");
	}
	
	@Test
	public void test()
	{
		System.out.println("Test Demo3");
	}
	@Test
	public void test3()
	{
		System.out.println("Test3 Demo3");
	}
	
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After Method Demo3");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class Demo3");
	}
	
	
	

}
