package testgroup;

import org.testng.annotations.Test;

public class TestClass {

    @Test(priority = 1)
    void setup() {
        System.out.println("setup, class 0");
    }

    @Test(priority = 2)
    void testSteps() {
        System.out.println("testSteps, class 0");
    }

    @Test(priority = 3)
    void testLast() {
        System.out.println("testLast, class 0");
    }
}
