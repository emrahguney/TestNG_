package Gun04;

import org.testng.annotations.*;

public class _01_Intro {

    /* @BeforeSuite
         @BeforeTest
             @BeforeGroups
                 @BeforeClass
                     @BeforeMethod
                         @Test method
                         @Test method
                     @AfterMethod
                 @AfterClass
             @AfterGroups
         @AfterTest
     @AfterSuite*/
    @BeforeSuite
    void bSuit() {
        System.out.println("Before Suite");
    }

    @BeforeTest
    void bTest() {
        System.out.println("Before Test");
    }

    @BeforeGroups
    void bGroups() {
        System.out.println("Before Groups");
    }

    @BeforeClass
    void bClass() {
        System.out.println("Before Class");
    }

    @BeforeMethod
    void bMethod() {
        System.out.println("Before Method");
    }

    @Test
    void Intro2_Test1() {
        System.out.println("Intro_1 -> Test 1 ");
    }

    @Test
    void Intro2_Test2() {
        System.out.println("Intro_1 -> Test 2 ");
    }

    @AfterMethod
    void aMethod() {
        System.out.println("After Method");
    }

    @AfterClass
    void aClass() {
        System.out.println("After Class");

    }

    @AfterGroups
    void aGroups() {
        System.out.println("After Groups");
    }

    @AfterTest
    void aTest() {
        System.out.println("After Test");
    }

    @AfterSuite
    void aSuit() {
        System.out.println("After Suite");
    }/* Before Class
        Before Method
        Intro_2 -> Test 1
        After Method
        Before Method
        Intro_2 -> Test 2
        After Method
        After Class             olarak cikti verir*/
}


