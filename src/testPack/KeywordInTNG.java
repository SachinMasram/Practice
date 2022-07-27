package testPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeywordInTNG {
	
//	Types of Keyword :
//		1.priority
//		2.dependsOnMethod
//		3.invocationCount

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before Method");
	}
	
	@Test (dependsOnMethods = {"test2"})
	public void test1() 
	{
		System.out.println("Test 1");
	}
	
	@Test (priority = 2,invocationCount = 3)
	public void test2() 
	{
		System.out.println("Test 2");
	}

	@Test (priority =1)
	public void test3() 
	{
		System.out.println("Test 3");
	}

   @AfterMethod
   public void aftermethod()
   {
	   System.out.println("After Method");
   }

  @AfterClass
  public void afterclass()
  {
	  System.out.println("After Class");
  }















}
