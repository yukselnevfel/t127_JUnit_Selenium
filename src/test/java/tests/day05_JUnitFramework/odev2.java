package tests.day05_JUnitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethods;

import java.time.Duration;

public class odev2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    //2- https://www.google.com/ adresine gidin
        driver.get("https://www.google.com/");
    //3- cookies uyarisini kabul ederek kapatin
    //4- Sayfa basliginin “Google” ifadesi icerdigini test edin
     String expectedTitleIcerik="Google";
     String actualTitle=driver.getTitle();
     if (expectedTitleIcerik.equals(actualTitle)){
         System.out.println("Title testi PASSED");
     }else {
         System.out.println("Title testi FAİLED");
         ReusableMethods.bekle(2);
         driver.quit();
     }

    //5- Arama cubuguna “Nutella” yazip aratin

    //6- Bulunan sonuc sayisini yazdirin
    //7- sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
    //8- Sayfayi kapatin
}
}