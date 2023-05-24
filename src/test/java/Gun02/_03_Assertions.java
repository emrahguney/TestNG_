package Gun02;

import Utility.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Assertions extends BaseDriver {


    @Test
    public void EqualOrnek(){

        String s1="Merhaba";
        String s2="Merhaba";

        //Actual(olusan)->s1, Expected(beklenen)->s2, Mesaj(opsiyonel)->Karsilastirma basarisiz oldu
        Assert.assertEquals(s1,s2,"Karsilastirma basarisiz oldu");
    }

    @Test
    public void NotEqualOrnek(){
        String s1="Merhaba1";
        String s2="Merhaba1";

        //Actual(olusan)->s1, Expected(beklenen)->s2, Mesaj(opsiyonel)->Karsilastirma basarisiz oldu
        Assert.assertNotEquals(s1,s2,"Olusan ve Beklenen birbirine esit oldu");
    }

    @Test
    public void TrueOrnek(){

        int s1=55;
        int s2=66;

        Assert.assertTrue(s1==s2,"Olusan ve Beklenen esit olmadi");//mesaji ELSE durumu gibi dusunun, bekledigim olmayinca gozukecek
    }

    @Test
    public void nullOrnek(){
        String s1=null;

        Assert.assertNull(s1,"olusan NULL olmadi");
    }

    @Test
    public void direkFail(){
        int a=55;

        if (a==55){
            Assert.fail();
        }
    }

}
