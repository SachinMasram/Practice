package pomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShaadiPage {

          WebDriver driver;

          WebDriverWait wait;
          
          @FindBy(xpath = "//a[@id='login-btn']")
          private WebElement Loginbutton;
          
          @FindBy(xpath = "//input[@id='email']")
          private WebElement Username;
          
          @FindBy(xpath = "//input[@id='password']")
          private WebElement Password;
          
          @FindBy(xpath = "//button[text()='Sign in']")
          private WebElement SignInbutton;
          
          
          public ShaadiPage(WebDriver driver)
          {
        	  this.driver=driver;
        	  PageFactory.initElements(driver,this);
        	  wait=new WebDriverWait(driver,Duration.ofSeconds(20));
          }

          public void ClickOnlogin()
          {
        	  Loginbutton.click();
          }


          public void SendUsername()
          {
        	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
        	  Username.sendKeys("SACHINMASRAM007@GMAIL.COM");
          }

 
          public void SendPassword()
          {
        	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']")));
        	  Password.sendKeys("Shaadi@12345");
          }


          public void ClickonSignin()
          {
        	  SignInbutton.click();
          }


          






























































}
