package pomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaPage {

	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath = "//input[@id='userid']")
	private WebElement Username;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement Password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Submit;
	
	@FindBy(xpath = "//input[@id='pin']")
	private WebElement Pin;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Continue;
	
	public ZerodhaPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	public void SendUsername()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='userid']")));
		Username.sendKeys("DV1510");
	}
	
	public void SendPassword()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']")));
		Password.sendKeys("Goal@123");
	}
	
	public void ClickOnButton()
	{


		Submit.click();
	}
	
	public void SendPin()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='pin']")));
		Pin.sendKeys("959594");
	}
	
	public void ClickOnContinue()
	{
		Continue.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
