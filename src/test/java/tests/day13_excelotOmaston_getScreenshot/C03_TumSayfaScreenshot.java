package tests.day13_excelotOmaston_getScreenshot;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C03_TumSayfaScreenshot extends TestBase {
    @Test
    public void aramaTesti(){
        // test otomasyonu anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");

        // Nutella icin arama yapin
        WebElement aramaKutusu= driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("Nutella "+ Keys.ENTER);

        // Arama sonucunda urun bulunamadigini test edin
        WebElement aramasonucElementi= driver.findElement(By.className("product-count-text"));


        // tum sayfanin fotografini cekip kaydedin
    }
}
