package testPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class Zerodha2WithTNG {
	
	WebDriver driver;
	
	@BeforeClass
	public void beforeclass()
	{
		  System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver\\chromedriver.exe");
			
		    driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.navigate().to("https://kite.zerodha.com/dashboard");
			
		
	}

}
