package Gun05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_DataProvider {
    /**
     * Aşağıdaki ikili ile Dataproviderın içindeki bütün veriler tek tek test e gönderilerek
     * data sayısı kadar test çalıştırılır, dataların olduğu yere DataProvider annottion ı konur.
     * çalıştırılacak teste ise dataProvider = "getData"  bölümü eklenir.
     * Dataprovider bir testi birden fazla DATA ile çok çalıştırmak için kullanılır.
     * XML filer file gruplama, pararalel, ve farklı tesleri koordine edip birarada çalıştırmak için kullanılır.
     */

    @Test(dataProvider = "getData")
    void UserNameTest(String useradi){
        System.out.println("useradi = " + useradi);
    }

    @DataProvider//bu metoda dataprovider gorevi verildi
    public Object[] getData(){//DataProvider olarak kullanilcak metodun tipi Object olmak zorunda

        Object[] users={"Nurhayat","Alper","Ugur","Hakan"};
        return users;
    }

}
