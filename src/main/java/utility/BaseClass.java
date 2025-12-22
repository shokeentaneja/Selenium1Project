package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass 
{
	public static WebDriver driver;
	@Parameters("browser")
	
	@BeforeMethod
	public void launch(@Optional("chrome")String nameOfBrowser) throws InterruptedException
	{
		if(nameOfBrowser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Thread.sleep(3000);
	}
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
}
