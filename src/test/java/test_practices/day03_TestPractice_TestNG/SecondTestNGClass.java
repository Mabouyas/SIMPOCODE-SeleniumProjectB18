package day03_TestPractice_TestNG;


import org.testng.annotations.Test;

public class SecondTestNGClass {
    @Test(priority = 1)
    void setup() { System.out.println("Opening browser"); }

    @Test(priority = 3)
    void searchCustomer() {System.out.println("Customer search test");}

    @Test(priority = 2)
    void addCustomer() { System.out.println("Add Customer Test"); }

    @Test(priority = 4)
    void tearDown() {System.out.println("Close the browser");}
}
