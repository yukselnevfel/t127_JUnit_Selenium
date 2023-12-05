package tests.Grup_Calismalari;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

import java.util.List;

public class Calisma_119Page extends TestBase {
    @Test
    public void test119(){

        //1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
        driver.get(" https://demo.guru99.com/test/guru99home/");
        //2) sayfadaki iframe sayısını bulunuz.
        List<WebElement> iframeSayisi=driver.findElements(By.tagName("iframe"));
        System.out.println(iframeSayisi.size());
        //3) ilk iframe'deki (Youtube) play butonuna tıklayınız.
        ReusableMethods.bekle(3);
        WebElement playButonu= driver.findElement(By.xpath("//button[@title='Oynat']"));
        playButonu.click();
        driver.switchTo().frame(playButonu);
        //4) ilk iframe'den çıkıp ana sayfaya dönünüz
        //5) ikinci iframe'deki (Jmeter Made Easy) linke
        //(https://www.guru99.com/live-selenium-project.html) tıklayını
    }
}
