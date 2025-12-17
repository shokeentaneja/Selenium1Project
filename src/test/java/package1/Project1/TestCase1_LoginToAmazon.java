package package1.Project1;

import org.testng.annotations.Test;

import utility.BaseClass;

public class TestCase1_LoginToAmazon extends BaseClass 
{
	@Test
	public void withvalidCreds()
	{
		HomePage homepage=new HomePage(driver);
		homepage.hoveroverOnAccountList(driver);
		homepage.clickToSignIn();
		
		/*LoginPage loginpage= new LoginPage(driver);
		loginpage.enterUserName();
		loginpage.clickOnContinue();
		loginpage.enterPassword();
		loginpage.clickToSignIn();*/
		
		
	}
}
