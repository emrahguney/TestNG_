package Gun03;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.tools.Tool;
import java.time.Duration;
import java.util.List;

/*
       Senaryo;
       1- Siteyi açınız.
       2- Adress Ekleyiniz.
       3- En son adresi edit yaparak ad ve soyadı değiştirip kaydediniz.
       4- En son adresi siliniz.
 */
public class _02_Ornek extends BaseDriver {

    @Test
    void addAddress(){
        Actions actions=new Actions(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement adressBook= driver.findElement(By.xpath("(//a[text()='Address Book'])[1]"));
        actions.moveToElement(adressBook).click().build().perform();

        WebElement newAdress= driver.findElement(By.xpath("//*[text()='New Address']"));
        actions.moveToElement(newAdress).click().build().perform();

       WebElement Fname=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
        actions.moveToElement(Fname).click().sendKeys("emrah").build().perform();

        WebElement Lname= driver.findElement(By.name("lastname"));
       actions.moveToElement(Lname).click().sendKeys("guney").build().perform();

        WebElement Company= driver.findElement(By.name("company"));
        actions.moveToElement(Company).click().sendKeys("TechnoStudy").build().perform();

        WebElement Adress1= driver.findElement(By.name("address_1"));
        actions.moveToElement(Adress1).click().sendKeys("Beykoz").build().perform();

        WebElement Adress2= driver.findElement(By.name("address_2"));
        actions.moveToElement(Adress2).click().sendKeys("Beykoz").build().perform();

        WebElement City= driver.findElement(By.name("city"));
        actions.moveToElement(City).click().sendKeys("Istanbul").build().perform();

        WebElement PCode= driver.findElement(By.name("postcode"));
        actions.moveToElement(PCode).click().sendKeys("34800").build().perform();

        WebElement Country= driver.findElement(By.id("input-country"));
        Select CCountry=new Select(Country);
        CCountry.selectByVisibleText("Turkey");

        WebElement Region= driver.findElement(By.id("input-zone"));
        Select RRegion=new Select(Region);
        RRegion.selectByVisibleText("İstanbul");

        WebElement Continue= driver.findElement(By.cssSelector("[value='Continue']"));
        actions.moveToElement(Continue).click().build().perform();



    }

    @Test(dependsOnMethods = {"addAddress"})
    void editAdress(){
        Actions actions=new Actions(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement adressBook= driver.findElement(By.xpath("(//a[text()='Address Book'])[1]"));
        actions.moveToElement(adressBook).click().build().perform();

        WebElement Edit= driver.findElement(By.xpath("//a[text()='Edit']"));
        actions.moveToElement(Edit).click().build().perform();

        WebElement newFname=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
        actions.moveToElement(newFname).doubleClick().keyDown(Keys.SHIFT).sendKeys("emrah").keyDown(Keys.SHIFT).build().perform();

        WebElement newLastname= driver.findElement(By.name("lastname"));
        actions.moveToElement(newLastname).doubleClick().keyDown(Keys.SHIFT).sendKeys("guney").keyDown(Keys.SHIFT).build().perform();

        WebElement Continue= driver.findElement(By.cssSelector("[value='Continue']"));
        actions.moveToElement(Continue).click().build().perform();

        Tools.successMessageValidation();
    }
    @Test(dependsOnMethods = {"editAdress"})
    void removeAdress(){
        WebElement addressBook= driver.findElement(By.linkText("Address Book"));
        addressBook.click();

        List<WebElement> editAll=driver.findElements(By.linkText("Delete"));
        WebElement silinebilirAdres=editAll.get(editAll.size()-2);//silinebilir 2.cisi
        silinebilirAdres.click();

        Tools.successMessageValidation();

    }
}
