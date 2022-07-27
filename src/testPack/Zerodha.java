package testPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomPackage.ZerodhaPage;

public class Zerodha {
	
	public static void main(String[] args) {
		
	
	
       System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://kite.zerodha.com/");
		
		
		System.out.println("To check Login Functionality");
		
	ZerodhaPage l=new ZerodhaPage(driver);
	l.SendUsername();
	l.SendPassword();
	l.ClickOnButton();
	l.SendPin();
	l.ClickOnContinue();
	
	Assert.fail();
	  
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
