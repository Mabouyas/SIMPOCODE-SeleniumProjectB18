package test.day2_findElement_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleTitleVerification {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("apple");
		driver.findElement(By.name("btnK")).click();
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "apple";
		
		if (actualTitle.startsWith(expectedTitle))
		{
			System.out.println("Google search title verification PASSED!");
		}
		else
		{
			System.out.println("Google search totle verification FAILED!!!");
		}
	}
}
