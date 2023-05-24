package Gun04;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class _04_ContactUs extends BaseDriver {

    @Test
    @Parameters({"mesaj"})//xml deki parametre adi ayni olmak zorunda

    void Test1(String gelenmesaj) {
        //String gelenmesaj : metod icin gerekli tanimlama ayni olmak zorunda degil

        WebElement contact = driver.findElement(By.linkText("Contact Us"));

        contact.click();

        WebElement message = driver.findElement(By.id("input-enquiry"));
        message.sendKeys(gelenmesaj);

        WebElement submitclick = driver.findElement(By.xpath("//input[@value='Submit']"));
        submitclick.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        WebElement contact2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Contact Us']")));

        Assert.assertEquals("Contact Us", contact2.getText());


    }
}
