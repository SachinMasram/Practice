package testPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pomPackage.FacebookPage;

public class FacebookLogin {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		
		System.out.println("Validate Facebook Information");
		
		FacebookPage Login = new FacebookPage(driver);
		Login.ValidateUsername();
		Login.ValidatePassword();
		Login.Validatelogin();
	}

}
