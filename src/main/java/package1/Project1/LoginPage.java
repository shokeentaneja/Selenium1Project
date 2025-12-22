package package1.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
		WebDriver driver;
		@FindBy(id="ap_email_login")
		private WebElement username;
		
		@FindBy(id="continue")
		private WebElement continuebutton;
		
		
		@FindBy(name="password")
		private WebElement password;
		
		@FindBy(id="signInSubmit")
		private WebElement signin;
		
		public void enterUserName()
		{
			username.sendKeys("shokeentaneja06@gmail.com");
		}
		
		public void clickOnContinue()
		{
			continuebutton.click();
		}
		
		public void enterPassword()
		{
			password.sendKeys("Avir@12345");
		}
		
		public void clickToSignIn()
		{
			signin.click();
			
		}
		
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
	}