package test_spring2020B18Automation.day08_alerts_iframes_windows;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Utilities.SmartBearUtilities;
import Utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class WebTablePractices {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		//TC #1: Smartbear software link verification
		//1. Open browser
		//2. Go to website:
		//http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
		driver = WebDriverFactory.getDriver("chrome");
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void p4_verifyOrder_test(){
		//Logging into smartbear
		SmartBearUtilities.login(driver);
		
		//Call my method the verify if given name is in the list or not.
		SmartBearUtilities.verifyOrder(driver, "Ricky Martin");
		
		
		
	}
	
	
	
}
