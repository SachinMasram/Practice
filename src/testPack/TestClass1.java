package testPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPackage.Class1Login;

public class TestClass1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		
		System.out.println("Validate Login Functionality");
		
		Class1Login login = new Class1Login(driver);
		
		login.sendUserName();
		login.sendPassword();
		login.clickonLoginbutton();
		
	}
	
}
