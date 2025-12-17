package package1.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver driver;
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	private WebElement accountslist;
	
	@FindBy(xpath="//span[text()='Sign in']")
	private WebElement signin;
	
	public void hoveroverOnAccountList(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountslist).perform();
		
	}
	
	public void clickToSignIn()
	{
		signin.click();
		
	}
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
