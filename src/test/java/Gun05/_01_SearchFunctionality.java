package Gun05;

import Utility.BaseDriver;
import Utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _01_SearchFunctionality extends BaseDriverParameter {
    /*
          Senaryo ;
          1- Siteyi açınız.
          2- mac kelimeini göndererek aratınız.
          3- Çıkan sonuçlarda mac kelimesinin geçtiğini doğrulayınız.
          4- aynı işlemi samsung için de yapınız
        */
    @Test
    @Parameters({"aranacakKelime"})
    public void Test1(String gelenmesaj) {

        WebElement search= driver.findElement(By.name("search"));
        search.sendKeys(gelenmesaj);

        WebElement searchClick= driver.findElement(By.cssSelector("[class='btn btn-default btn-lg']"));
        searchClick.click();

List<WebElement> captions= driver.findElements(By.cssSelector("div[class='caption']>h4"));


for (WebElement e:captions){

    Assert.assertTrue(e.getText().toLowerCase().contains(gelenmesaj));
}


    }
}
