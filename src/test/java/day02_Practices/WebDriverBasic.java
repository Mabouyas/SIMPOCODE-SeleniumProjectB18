package day02_Practices;
/*
1- Open a browser
2- Open URL (http ://www.newtours.demoaut.com)
3- Enter username (mercury)
4- Enter password (mercury)
5- Click login
6- Check page title
 */
import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebDriverBasic {
	public static void main(String[] args) {
		WebDriver driver = WebDriverFactory.getDriver("chrome");
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Find a Flight: Mercury Tours:";
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Title verification message PASSED!");
		}
		else
		{
			System.out.println("Title verification message FAILED!!");
		}
		
		
	}
}
