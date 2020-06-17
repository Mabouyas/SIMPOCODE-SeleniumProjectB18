package day03_TestPractice_TestNG;
/*
1-Open the browser
2-Login test
3-Closing the browser
 */
import org.testng.annotations.Test;

public class FirstTestNGClass {

    @Test(priority = 1)
    void setup() {
        System.out.println("Open the browser");
    }

    @Test(priority = 2)
    void login() {
        System.out.println("This is the login test");
    }

    @Test(priority = 3)
    void tearDown() {
        System.out.println("Closing the browser");
    }

}
