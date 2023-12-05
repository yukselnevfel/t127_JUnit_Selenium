package tests.Grup_Calismalari;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

public class Calisma_118Page extends TestBase {

    @Test
    public void test118Iframe(){
        //1 ) https://the-internet.herokuapp.com/iframe adresine gidin.
        driver.get("https://the-internet.herokuapp.com/iframe");
        //2 ) Bir metod olusturun: iframeTest
        //- “An IFrame containing….” textinin erisilebilir oldugunu test edin ve
        //konsolda yazdirin.
        WebElement iframeTest= driver.findElement(By.tagName("h3"));
        Assert.assertTrue(iframeTest.isDisplayed());
        System.out.println(iframeTest.getText());
        //- Text Box’a “Merhaba Dunya!” yazin.
        WebElement iframeElementi= driver.findElement(By.tagName("iframe"));
        


        //- TextBox’in altinda bulunan “Elemental Selenium” linkini textinin
        //gorunur oldugunu dogrulayin ve konsolda yazdirin
    }
}
