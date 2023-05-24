package Gun06;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
/*
   Senaryo :
   1- Siteyi açınız.
   2- Sitede "ipod" kelimesini aratınız
   3- Çıkan sonuçlardan ilkini sepete atınız.
   4- Shopping Chart a tıklatınız.
   5- Checkout yapınız.
   6- Continue butonalarına tıklatıp bilgileri giriniz.
   7- En confirm ile siparişi verdiğinizi doğrulayınız.
      doğrulamayı çıkan sayfadaki "Your order has been placed" yazısı ile yapınız.
*/

public class _02_PlaceHolder extends BaseDriver {


    @Test
    public  void Test1() {
        WebElement search= driver.findElement(By.name("search"));
        search.sendKeys("ipod");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));

        WebElement search2= driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
        search2.click();

        WebElement addCartFirst= driver.findElement(By.xpath("(//*[text()='Add to Cart'])[1]"));
        addCartFirst.click();

        WebElement SCart= driver.findElement(By.id("cart-total"));
        SCart.click();

        WebElement checkOut= driver.findElement(By.xpath("//*[text()=' Checkout']"));
        checkOut.click();


       WebElement cont1= driver.findElement(By.id("button-payment-address"));
       cont1.click();

       WebElement cont2= driver.findElement(By.id("button-shipping-address"));
       cont2.click();

WebElement comment= driver.findElement(By.xpath("(//textarea[@name='comment'])[1]"));
comment.sendKeys("qewrty");

       WebElement cont3= driver.findElement(By.id("button-shipping-method"));
       cont3.click();

       WebElement agree= driver.findElement(By.name("agree"));
       agree.click();
       WebElement payment= driver.findElement(By.xpath("(//textarea[@name='comment'])[2]"));
       payment.sendKeys("qewrty");

       WebElement cont4= driver.findElement(By.id("button-payment-method"));
       cont4.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement confirmOrder= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button-confirm")));
        confirmOrder.click();



        WebElement text=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Your order has been placed!']")));

        Assert.assertEquals(text.getText(),"Your order has been placed!");

    }


}
