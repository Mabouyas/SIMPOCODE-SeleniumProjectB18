package test_spring2020B18Automation.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import Utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {
	
	protected WebDriver driver;
	
	@BeforeMethod
	public void setUpMethod(){
		driver = WebDriverFactory.getDriver("chrome");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void tearDownMethod(){
		driver.quit();
	}
	
}

