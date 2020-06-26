package test.day3_cssSelector_xpath;

import Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class ExampleForWebDriverFactory {
	public static void main(String[] args) {
		//WebDriverManager.chromedriverA().setup();
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver =  WebDriverFactory.getDriver("chrome");
		driver.get("https://www.google.com");
		
	}
}
