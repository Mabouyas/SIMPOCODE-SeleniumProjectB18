package test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_Practice {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Google";
		if (ActualTitle.equals(ExpectedTitle)) {
			System.out.println("Google title verification PASSED");
		}else {
			System.out.println("Google title verification FAILED");
		}
	}
}
