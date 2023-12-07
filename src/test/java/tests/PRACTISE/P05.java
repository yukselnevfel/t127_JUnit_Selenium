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
        driver.get("https://the-internet.herokuapp.com/iframe");
        //  3- "An IFrame containing…." textinin erisilebilir oldugunu test edin ve  konsolda yazdirin.
        WebElement yaziElementi= driver.findElement(By.xpath("(//h3)[1]"));
        Assert.assertTrue(yaziElementi.isEnabled());
        System.out.println(yaziElementi.getText());

        //2.yol
        String expectedYaziIcerik="An iFrame containing the TinyMCE WYSIWYG Editor";
        String actualYaziIcerik=yaziElementi.getText();
        Assert.assertEquals(expectedYaziIcerik,actualYaziIcerik);
        //  4- Text Box'a "Merhaba Dunya!" yazin.
        WebElement iframeElement= driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iframeElement);
        WebElement textArea= driver.findElement(By.xpath("//*[@data-id='mce_0']"));
        textArea.clear();
        textArea.sendKeys("Merhaba Dunya!");
        driver.switchTo().defaultContent();
        //  5- TextBox'in altinda bulunan "Elemental Selenium" link textinin gorunur oldugunu dogrulayin
        //      ve  konsolda yazdirin.
        WebElement eSelenium=driver.findElement(By.xpath("(//a[@target='_blank'])[2]"));
        Assert.assertTrue(eSelenium.isDisplayed());
        System.out.println(eSelenium.getText());


    }
}
