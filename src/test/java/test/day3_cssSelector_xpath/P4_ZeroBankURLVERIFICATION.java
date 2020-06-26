package test.day3_cssSelector_xpath;
/*
TC #5: Basic authentication Zero Bank1.
Open Chrome browser2.
Go to http://zero.webappsecurity.com/login.html3.Enter username: username4.
Enter password: password5.
Click sign in button6.
Verify username is displayed on the page7.
Verify the title Zero –Account Summary8.
Verify the link Account Summary’s href value contains: “account-summary”Print out results in validation formats
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_ZeroBankURLVERIFICATION {
	public static void main(String[] args) {
		//TC #4: Zero Bank URL verification
		//1. Open Chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//2. Go to http://zero.webappsecurity.com/login.html
		driver.get("http://zero.webappsecurity.com/login.html");
		
		//3. Get attribute value of href from the “forgot your password” link
		WebElement forgotPasswordLink =driver.findElement(By.linkText("Forgot your password ?"));
		//WebElement forgotPasswordLink = driver.findElement(By.partialLinkText("Forgot"));
		//WebElement forgotPasswordLink = driver.findElement(By.partialLinkText("your"));
		//WebElement forgotPasswordLink = driver.findElement(By.partialLinkText("password"));
		//WebElement forgotPasswordLink = driver.findElement(By.partialLinkText("?"));
		//4. Verify attribute value contains
		//Expected: “/forgot-password.html”
		
		String actualHrefValue = forgotPasswordLink.getAttribute("href");
		String expectedInHrefValue = "/forgot-password.html";
		
		System.out.println("actualHrefValue = " + actualHrefValue);
		
		if (actualHrefValue.contains(expectedInHrefValue)){
			System.out.println("Href value verification PASSED!");
		}else {
			System.out.println("Href value verification FAILED!");
		}
		
		System.out.println("Is forgot password displayed? " +forgotPasswordLink.isDisplayed());
		
	}
	
	}

