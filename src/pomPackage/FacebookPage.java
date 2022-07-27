package pomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookPage {
	
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement Username;
	
	@FindBy(xpath = "//input[@id='pass']")
	private WebElement Password;
	
	@FindBy(xpath = "//button[@name='login']")
	private WebElement login;
	

	public FacebookPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
	}
	
	public void ValidateUsername()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
		Username.sendKeys("Sachinmasram143@gmail.comm");
	}
	
	public void ValidatePassword()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='pass']")));
		Password.sendKeys("Sachin@16091992");
		
	}
   
	public void Validatelogin()
	{
		login.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
