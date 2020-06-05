package test.day2_findElement_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5_SmartBear_TitleVerification {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Web Orders Login";
		
		if (actualTitle.equals(expectedTitle))
		{
			System.out.println("HomePage title verification PASSED!");
		}
		else
		{
			System.out.println("HomePage verification FAILED!!!");
		}
		
		driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
		driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
		driver.findElement(By.name("ctl00$MainContent$login_button")).click();
		
		if (driver.getTitle().equals("Web Orders"))
		{
			System.out.println("Landing Page title verification passed!");
		}
		else
		{
			System.out.println("Landing Page title verification failed!!!");
		}
	}
}
