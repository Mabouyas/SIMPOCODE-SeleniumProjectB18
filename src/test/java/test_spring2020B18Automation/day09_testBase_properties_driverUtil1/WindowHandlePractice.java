package test_spring2020B18Automation.day09_testBase_properties_driverUtil1;

import Utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;


	
	public class WindowHandlePractice {
		
		WebDriver driver;
		
		@BeforeMethod
		public void setUpMethod(){
			
			driver = WebDriverFactory.getDriver("chrome");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
		
		@Test
		public void multiple_window_test(){
			
			driver.get("https://www.amazon.com");
			
			// we are downcasting our driver to JavascriptExecutor to be able to use its methods.
			((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
			((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
			((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
			
			//5. Create a logic to switch to the tab where Etsy.com is open
			Set<String> windowHandles = driver.getWindowHandles();
			
			for (String each : windowHandles) {
				
				driver.switchTo().window(each);
				System.out.println("current title:" + driver.getTitle());
				
				if (driver.getCurrentUrl().contains("etsy")){
					// 6. Assert: Title contains “Etsy”
					Assert.assertTrue(driver.getTitle().contains("Etsy"));
					break;
				}
				
			}
			
			
			
			
			
		}
		
	}

