package Gun03;

import org.testng.annotations.Test;

public class _01_Dependency {
    //arabanin hareketi : start, drive, park, stop hareket sirasi

    @Test
    void startCar(){
        System.out.println("startCar");
       // Assert.fail();
    }


    @Test(dependsOnMethods = {"startCar"})//bu testin calismasi, startCar in hatasiz calismasina bagimli
    void driveCar(){
        System.out.println("driveCar");
    }
    @Test(dependsOnMethods = {"startCar","driveCar"})
    void  parkCar(){
        System.out.println("parkCar");
    }

    //alwaysRun= true bagimliliklari var ama hata cikarsada yine calistir
    @Test(dependsOnMethods = {"parkCar"},alwaysRun = true)
    void stopCar(){
        System.out.println("stopCar");
    }
}// aynı seviyedeki testleri için priority verilebilir.
// bağımlı testler, direk metodundan çalıştırdığınızda bağımlı olduğu metod zincirinde
// 2 üste kadar ototmatik çağırıp çalışabilir.
