package testPack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPackage.ShaadiPage;

public class Shaadi {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.navigate().to("https://www.shadi.com/");
			
			System.out.println("Validated Shaadi.com Login Functionality");
			
			ShaadiPage s = new ShaadiPage(driver);
			s.ClickOnlogin();
			s.SendUsername();
			s.SendPassword();
			s.ClickonSignin();
			
			Alert alt =driver.switchTo().alert();
			alt.accept();
			alt.dismiss();
			
			
			
			
	}

}
