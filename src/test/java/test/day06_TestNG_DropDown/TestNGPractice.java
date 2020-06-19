package test.day06_TestNG_DropDown;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGPractice
    {
        @BeforeMethod
        public void setUp(){ System.out.println("Before method is running..."); }

        @AfterMethod
        public void tearDown(){ System.out.println("After method is running..."); }

        @Test
        public void test1()
        {
            System.out.println("Test1 is running...");
            String actualTitle = "Homepage"; //driver.getTitle();
            String expectedTitle = "Homepage";
            Assert.assertEquals(actualTitle, expectedTitle);
        }

        @Ignore
        @Test
        public void test2(){
            System.out.println("Test2 is running...");

            Assert.assertEquals("string1", "string2", "String verification on test2 failed.");
        }


        //@Test
        public void test3(){
            System.out.println("Test3 is running...");

            String actualTitle = "Amazon prime";
            String expectedInTitle = "prime";
            String testString = "asdofjasdf";

            //if the boolean value we pass in assertTrue is "true", assertion will pass.
            //else it will fail

            //Assert.assertTrue(false);
            Assert.assertTrue(actualTitle.contains(expectedInTitle));
            //Assert.assertTrue(actualTitle.contains(testString));
            System.out.println("JUST CHECKING IF THIS LINE IS RUNNING!!!!");
            Assert.assertFalse(actualTitle.contains(testString));

        }




    }
