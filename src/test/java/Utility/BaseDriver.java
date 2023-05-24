package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {
    public static WebDriver driver;
    public static WebDriverWait wait;
    @BeforeClass
    public void baslangicIslemler(){
        System.out.println("baslangic islemleri yapiliyor");
        //KalanOncekileriKapat();

        Logger logger= Logger.getLogger(""); // sisteme ait bütün logları üreten objeye/servise ulaştım ""
        logger.setLevel(Level.SEVERE); // Sadece errorları göster


        //gerekmeyen loglari(calistirdiginda kirmizi yazilari) kaldiracagiz
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");

        //GUNCELLEME SIKINTILI OLURSA
        ChromeOptions options = new ChromeOptions();
   options.addArguments("--remote-allow-origins=*");
   driver = new ChromeDriver(options);
  // BU KODU KULLAN AMA ASAGIDAKI "driver=new ChromeDriver();" 30. SATIRDAKI KODU YORUM SATIRINA ALMAN LAZIM

        //driver=new ChromeDriver();

        driver.manage().window().maximize(); //ekrani buyutor

        Duration dr=Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr);
        // Sadece tüm sayfanın kodlarının bilgisayarınıza inmesi süresiyle ilgili
        //bu eklenmezse Selenium sayfa yüklenene kadar (sonsuza) bekler.:
        // 30 sn süresince sayfanın yüklenmesini bekle yüklenmezse hata ver
        // eğer 2 sn yüklerse 30 sn. beklemez

        driver.manage().timeouts().implicitlyWait(dr); // Bütün weblementlerin element bazında, elemente özel işlem yapılmadan önce
        // hazır hale gelmesi verilen mühlet yani süre. // eğer 2 sn yüklerse 30 sn. beklemez.
        wait = new WebDriverWait(driver,
                Duration.ofSeconds(30));
        logintest();
    }

    @AfterClass
    public void bitisIslemleri(){
        System.out.println("bitis islemleri yapiliyor");
        Tools.Bekle(3);
        driver.quit();
    }

    void logintest(){
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
        WebElement email= driver.findElement(By.name("email"));
        email.sendKeys("emrahguney@hotmail.com");
        Tools.Bekle(1);
        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("emrahguney");
        Tools.Bekle(1);
        WebElement login= driver.findElement(By.cssSelector("[value='Login']"));
        login.click();
        Tools.Bekle(1);
    }
}
