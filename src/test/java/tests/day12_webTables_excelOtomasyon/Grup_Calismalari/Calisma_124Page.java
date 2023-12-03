package tests.day12_webTables_excelOtomasyon.Grup_Calismalari;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

public class Calisma_124Page extends TestBase {


    @Test
    public void test124(){

        //● Tests package’inda yeni bir class olusturun: WindowHandle2
        //● https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/");
        String ilkSayfaWhd =driver.getWindowHandle();
        System.out.println("ilk sayfa handle: "+ilkSayfaWhd);
        //● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        //anlamadım!!!
        //● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        String expectedTitle="The Internet";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        //● Click Here butonuna basın.
        //● Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu
        //dogrulayin.
        //● Sayfadaki textin “New Window” olduğunu doğrulayın.
        //● Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet”
        //olduğunu doğrulayın
    }
}
