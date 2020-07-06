package test_practices.day02_Practices;
/*
TC #1: Practice Cybertek.com_ForgotPassword WebElement verification1.
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/forgot_password
3. Locate all the WebElements on the page using XPATH locator only (total of 6)
	a. “Home” link
	b. “Forgot password” header
	c. “E-mail” text
	d. E-mail input box
	e. “Retrieve password” button
	f. “Powered by Cybertek School” text
4. Verify all WebElements are displayed
 */

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ForgotPassword {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = WebDriverFactory.getDriver("Chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://practice.cybertekschool.com/forgot_password");
		
		WebElement HomeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));
		WebElement ForgotPasswordHead = driver.findElement(By.xpath("//form[@name='forgot_password']"));
		WebElement labelEmail = driver.findElement(By.xpath("//label[@for='email']"));
		WebElement inputEmail = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement signIcon = driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']"));
		WebElement poweredLink = driver.findElement(By.xpath("//a[@href='https://cybertekschool.com/']"));
		
		
		
		List<WebElement> listOfLinks = driver.findElements(By.xpath("//body"));
		//System.out.println("Page with title \"" + driver.getTitle() +"\" has " + listOfLinks.size() +" link" );
		for ( int i =0; i < listOfLinks.size(); i++) { System.out.println(listOfLinks.get(i).getText()); }
		
		
		System.out.println("");
		WebElement HomeLinkClick = driver.findElement(By.xpath("//a[.='Home']"));
		System.out.println(HomeLinkClick.getText());
		HomeLinkClick.click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("gmail@gmail.com");
		 driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']")).click();
		 System.out.println("Your e-mail's been sent!");
		 Thread.sleep(3000);
		 driver.navigate().back();
		
	}
}