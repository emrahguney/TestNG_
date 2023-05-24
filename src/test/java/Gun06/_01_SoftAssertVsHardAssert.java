package Gun06;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _01_SoftAssertVsHardAssert {

    @Test
    void hardAssert(){

        String s1="Merhaba";

        System.out.println("HARD ASSERT ONCESI");
        Assert.assertEquals("Merhaba123",s1,"Olusanla beklenen esit degil"); //test kiriliyor
        System.out.println("Hard assert sonrasi");


    }

    @Test
    void softAssert(){

        String strHomePage="www.facebook.com/homepage";
        String strCartPage="www.facebook.com/cartpage";
        String strEditAccount="www.facebook.com/editaccountpage";

        SoftAssert _softAssert=new SoftAssert();

        _softAssert.assertEquals("www.facebook.com/homepage",strHomePage);//true
        System.out.println("soft Assert 1");

        _softAssert.assertEquals("www.facebook.com/profile", strCartPage);//false
        System.out.println("soft Assert 2");

        _softAssert.assertEquals("www.facebook.com/settings",strEditAccount);//false
        System.out.println("soft Assert 3");

        _softAssert.assertAll(); //butun assert sonuclarini isleme koyuyor
        System.out.println("soft assertAll : aktiflik sonrasi");
        //bu bolum assertAll dan sonra oldugu ve oncesinde hata olustugu icin ekrana cikamayacak

    }

}
