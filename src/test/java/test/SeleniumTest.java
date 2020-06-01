package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	public static void main(String[] args) {
		//Set up the web driver
		WebDriverManager.chromedriver().setup();
		//Create the instance of the Chrome driver
		WebDriver driver = new ChromeDriver();
		//Test if driver is working
		driver.get("www.google.com");
		
		
		
	}
	

}
