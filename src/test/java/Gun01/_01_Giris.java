package Gun01;

import org.testng.annotations.Test;

public class _01_Giris {
    //Eger herhangi bir siralama verilmezse metod isimlerinin alfabetik olarak calisitirir
    //priority ile hangi siraya gore calistirabilirsin
    @Test(priority = 2)
    public void driverikapat(){
        System.out.println("driver kapatildi");
    }

    @Test(priority = 1)//default-> priority=0 alir->bir tanesinin yaninda priority yoksa ilk onu alir
    public void websitesiniac(){

        System.out.println("driver tanimlandi ve webSitesi acildi");
    }
    @Test(priority = 3)
    public void loginisleminiyap(){
        System.out.println("LoginTest yapildi");
    }

}
