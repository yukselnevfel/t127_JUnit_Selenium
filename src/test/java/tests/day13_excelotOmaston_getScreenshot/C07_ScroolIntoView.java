package tests.day13_excelotOmaston_getScreenshot;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase;

public class C07_ScroolIntoView extends TestBase {

    @Test
    public void newProductTesti(){
// test otomasyonu anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");

// Best Sport Shoes bolumu gorununceye kadar asagi inin

        ReusableMethods.bekle(3);
        WebElement bestSportShoesElementi = driver.findElement(By.xpath("(//p[@class='blog-heading'])[2]"));
        JavascriptExecutor javascriptExecutor= (JavascriptExecutor) driver;

// linki tiklayin




// h1 taginda "Best Sport Shoes For Multi Gender" yazdigini test edin
    }
}
