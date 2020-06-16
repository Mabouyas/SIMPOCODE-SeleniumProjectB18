package day01_TestPractices;

import Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class SeleniumDemo {
	public static void main(String[] args) {
		WebDriver driver = WebDriverFactory.getDriver("Chrome");
		driver.manage().window().maximize();
		driver.get("http://www.chrome.com");
		
		driver.quit();
	}
}
