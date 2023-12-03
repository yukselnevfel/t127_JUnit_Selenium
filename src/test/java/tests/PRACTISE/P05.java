package tests.PRACTISE;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class P05 extends TestBase {
    // 1 ) https://the-internet.herokuapp.com/iframe adresine gidin.
    // 2 ) Bir metod olusturun: iframeTest
    //  3- "An IFrame containing…." textinin erisilebilir oldugunu test edin ve  konsolda yazdirin.
    //  4- Text Box'a "Merhaba Dunya!" yazin.
    //  5- TextBox'in altinda bulunan "Elemental Selenium" link textinin gorunur oldugunu dogrulayin
    //      ve  konsolda yazdirin.

    @Test
    public void IFrameTest(){
        // 1 ) https://the-internet.herokuapp.com/iframe adresine gidin.
        driver.get("https://the-internet.herokuapp.com/");
        //  3- "An IFrame containing…." textinin erisilebilir oldugunu test edin ve  konsolda yazdirin.
        WebElement yaziElementi= driver.findElement(By.xpath("(//h3)[1]"));
        Assert.assertTrue(yaziElementi.isEnabled());
        System.out.println(yaziElementi.getText());

        WebElement iframeElement= driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iframeElement);


    }
}
