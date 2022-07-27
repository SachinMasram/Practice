package testPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomPackage.Class1Login;
import pomPackage.HomePage;

public class TestClassWithTNG2 {

	WebDriver driver;
		
		@BeforeClass 
		public void beforeClass()
		{
			
			System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver\\chromedriver.exe");
			
			 driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			
		}
		

		@BeforeMethod
		public void login()
		{
			Class1Login login = new Class1Login(driver);
			
			login.sendUserName();
			login.sendPassword();
			login.clickonLoginbutton();
			
		}
		
		@Test
		public void ValidateHomePage()
		{
			HomePage home= new HomePage(driver);
			home.ValidateAdminTab();
			home.ValidatePIMTab();
			home.ValidateLeaveTab();
		}
		
		
		@AfterMethod
		public void aftermethod()
		{
			HomePage home = new HomePage(driver);
			home.ClickOnAvtar();
			home.ClickOnLogout();
		}
		@AfterClass
		public void afterClass()
		{
			driver.quit();
		}
		
		
		
		
	}


