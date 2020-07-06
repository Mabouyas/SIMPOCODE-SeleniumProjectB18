package test_spring2020B18Automation.day09_testBase_properties_driverUtil1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import Utilities.ConfigurationReader;
import Utilities.Driver;

public class DriverUtilsPractice {
	
	
	@Test
	public void driver_practice(){
		Driver.getDriver().get("https://www.google.com");
		//Singleton.getWord();
		WebElement googleSearch = Driver.getDriver().findElement(By.name("q"));
		
		googleSearch.sendKeys(ConfigurationReader.getProperty("testdata") + Keys.ENTER);
		
		
	}
	
	
	@Test
	public void singleton_practice(){
		String str1 = Singleton.getWord();
		System.out.println("str1 = " + str1);
		
		String str2 = Singleton.getWord();
		System.out.println("str2 = " + str2);
		
		String str3 = Singleton.getWord();
		System.out.println("str3 = " + str3);
	}
	
	@Test
	public void singleton_practice2(){
		String str4 = Singleton.getWord();
		System.out.println("str4 = " + str4);
	}
	
	
}