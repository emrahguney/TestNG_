package Gun05;

import Utility.BaseDriverParameter;
import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class _05_Task_2 extends BaseDriverParameter {
    /**
     * Bir önceki task(dataproviderlı) da yapılan testi PARAMETERDRIVER ile yapınız
     * sonrasında fakrlı tarayıcılar ile çalıştırınız. (crossbrowser)
     * sonrasında paralel çalıştırınız.(parallel)
     */
    @Test(dataProvider = "getData")
    void Test1(String gelenmesaj) {

        WebElement search = driver.findElement(By.name("search"));
        search.clear();
        search.sendKeys(gelenmesaj);


        WebElement searchClick = driver.findElement(By.cssSelector("[class='btn btn-default btn-lg']"));
        searchClick.click();

        List<WebElement> captions = driver.findElements(By.cssSelector("div[class='caption']>h4"));


        for (WebElement e : captions) {

            Assert.assertTrue(e.getText().toLowerCase().contains(gelenmesaj.toLowerCase()));

        }
        
    }
    @DataProvider
    Object[] getData(){
        Object[] data={"mac","ipod","samsung"};
        return data;

    }
}
