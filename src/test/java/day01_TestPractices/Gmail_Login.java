package day01_TestPractices;
/*
Scenario:

Launch the browser and open “Gmail.com”.
Verify the title of the page and print the verification result.
Enter the username and Password.
Click on the Sign in button.
Close the web browser.
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String appUrl = "https://accounts.google.com";
		driver.get(appUrl);
		String expectedTitle = " Sign in - Google Accounts ";
		String actualTitle = driver.getTitle();
		
		if (expectedTitle.equals(actualTitle))
		{
			System.out.println("Verification Successful");
		}
		else
		{
			System.out.println("Verification Failed");
		}
		
		WebElement username = driver.findElement(By.id("Email"));
		username.clear();
		username.sendKeys("TestSelenium");
		
		
		
	}
}
