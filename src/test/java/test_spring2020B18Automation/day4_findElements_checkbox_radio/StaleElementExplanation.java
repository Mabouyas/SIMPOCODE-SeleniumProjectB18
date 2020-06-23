package test_spring2020B18Automation.day4_findElements_checkbox_radio;

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StaleElementExplanation {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com");
        //Locating gmail link from top right corner
        WebElement gmailLink = driver.findElement(By.xpath("//a[.='Gmail']"));

        driver.navigate().refresh();
        gmailLink = driver.findElement(By.xpath("//a[.='Gmail']"));
        //clicking to the link
        gmailLink.click();

    }
}
