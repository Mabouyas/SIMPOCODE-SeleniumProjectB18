package day04_TestNGDropDown;
/*
TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/dropdown
3. Verify “Simple dropdown” default selected value is correct
Expected: “Please select an option”
4. Verify “State selection” default selected value is correct
Expected: “Select a State”
 */

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC1 {
    WebDriver driver;

    @BeforeMethod
    void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    void tearDown() throws InterruptedException { Thread.sleep(2000);driver.close(); }

    //Verify simple dropdown

    @Test
    void test_dropDown_verification()
    {
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        String actualSimpleDropdown = simpleDropdown.getFirstSelectedOption().getText();
        String expectedSimpleDropdown = "Please select an option";

        Assert.assertEquals(actualSimpleDropdown, expectedSimpleDropdown);

        //Verify State selection

        Select stateSelection = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        String actualStateSelection = stateSelection.getFirstSelectedOption().getText();
        String expectedSelectSelection = "Select a State";

        Assert.assertEquals(actualStateSelection,expectedSelectSelection);

    }

    @Test
    void test1_dropDown_Verification() throws InterruptedException {
        Select stateSelection = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        stateSelection.selectByValue("IL");
        Thread.sleep(10);

        stateSelection.selectByVisibleText("Virginia");
        Thread.sleep(10);

        stateSelection.selectByVisibleText("California");
        Thread.sleep(10);
    }
}
