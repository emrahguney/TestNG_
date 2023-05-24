package Gun02;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_Ornek extends BaseDriver {

    @Test
    void logintest(){
        /*https://opencart.abstracta.us/index.php?route=account/login
        * kullanici adi=emrahguney@hotmail.com
        * sifre=emrahguney                                          */

        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
        System.out.println("test 1 calisti");

        WebElement email= driver.findElement(By.name("email"));
        email.sendKeys("emrahguney@hotmail.com");
        Tools.Bekle(1);
        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("emrahguney");
        Tools.Bekle(1);

        Tools.Bekle(1);
        WebElement login= driver.findElement(By.cssSelector("[value='Login']"));
        login.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://opencart.abstracta.us/index.php?route=account/account");
        Assert.assertEquals(driver.getTitle(), "My Account","Login olamadi");

    }
}
