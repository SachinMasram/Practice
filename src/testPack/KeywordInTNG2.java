package testPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeywordInTNG2 {
	
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
	
	@Test(enabled = false)
	public void test1()
	{
		System.out.println("Test1");
	}
	
	@Test(timeOut = 2000)
	public void test2() throws InterruptedException
	{
		System.out.println("Test2");
		Thread.sleep(3000);
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
