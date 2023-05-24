package Gun05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class _03_DataProvider_CokBoyutlu {

    @Test(dataProvider="UserData")
    void UsernameTest(String username, String password){
        System.out.println("user = "+username+" "+password);
    }

    @DataProvider
    public Object[][] UserData(){

        Object[][] data={
                {"Nurhayat","122333"},
                {"Alper","223344"},
                {"Ugur","qwert"},
                {"Hakan","zzzzz"},
        };

                return data;
    }
}
