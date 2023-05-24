package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _04_Task extends BaseDriver {
    /**
     * Daha önceki derslerde yaptğımız Search fonksiyonunu
     * mac,ipod ve samsung için Dataprovider ile yapınız.
     * BaseDriver
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
            System.out.println(e.getText());

            Assert.assertTrue(e.getText().toLowerCase().contains(gelenmesaj.toLowerCase()));

        }
    }
    @DataProvider
    Object[] getData(){
        Object[] data={"mac","ipod","samsung"};
        return data;
    }
}