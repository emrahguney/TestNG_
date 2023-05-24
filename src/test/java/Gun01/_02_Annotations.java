package Gun01;

import org.testng.annotations.*;
/*
      @BeforeClass      -->   Class ın başında çalışacak   (driver işlemleri)
         @BeforeMethod  -->   Her metoddan(test metodları) önce çalışacak
             @Test      -->   testlerin çalıştığı metodlar
             @Test      -->   testlerin çalıştığı metodlar
         @AfterMethod   -->   Her metoddan sonra çalışacak
      @AfterClass       -->   Class ın çalışmasının sonunda çalışacak (driver kapat)
   */
public class _02_Annotations {

   @BeforeClass
   public void beforeClass(){
       System.out.println("before class calisti");

   }
    @AfterClass
    public void afterClass(){System.out.println("after class calisti"); }

    @Test
    public void test1(){
        System.out.println("test1 calisti");
    }
    @Test
    public void test2(){
        System.out.println("test2 calisti");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method calisti");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("after method calisti");
    }

}
