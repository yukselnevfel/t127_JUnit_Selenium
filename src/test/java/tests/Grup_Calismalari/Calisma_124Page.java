package tests.Grup_Calismalari;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.Set;

public class Calisma_124Page extends TestBase {


    @Test
    public void test124(){

        //● Tests package’inda yeni bir class olusturun: WindowHandle2
        //● https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");
        String ilkSayfaWhd =driver.getWindowHandle();
        System.out.println("ilk sayfa handle: "+ilkSayfaWhd);
        //● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        WebElement openSayfa= driver.findElement(By.tagName("h3"));
        Assert.assertTrue(openSayfa.isDisplayed());
        //● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        String expectedTitle="The Internet";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        //● Click Here butonuna basın.
        driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
        //● Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu
        //dogrulayin.
        ilkSayfaWhd =driver.getWindowHandle();
        Set<String> Whd =driver.getWindowHandles();
        String ikinciSayfaWhd="";
        for (String each:Whd
             ) {
            if (!each.equals(ilkSayfaWhd)){
                ikinciSayfaWhd=each;
            }
        }
        driver.switchTo().window(ikinciSayfaWhd);
        String ExpectedTitle="New Window";
        String ActualTitle= driver.getTitle();
        Assert.assertEquals(ExpectedTitle,ActualTitle);

        //● Sayfadaki textin “New Window” olduğunu doğrulayın.
        WebElement windowSayfa= driver.findElement(By.tagName("h3"));
        String expectedWindows="New Window";
        String actualWindow=windowSayfa.getText();
        Assert.assertEquals(expectedWindows,actualWindow);
        //● Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet”
        //olduğunu doğrulayın
        driver.switchTo().window(ilkSayfaWhd);
        String ExpectedIlkSayfa= driver.getTitle();
        String ActualIlkSayfa="The Internet";
        Assert.assertEquals(ExpectedIlkSayfa,ActualIlkSayfa);
    }
}
