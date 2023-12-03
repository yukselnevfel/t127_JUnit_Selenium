package tests.Grup_Calismalari;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Calisma_exerciseFz extends TestBase {

    // https://trytestingthis.netlify.app/ adresine gidin
    //        // "Your Website to practice Automation Testing" gorundugunu dogrulayin
    //        // "This is your Sample login page" de bulunan "username" ve "password" de
    //        //              aciklamaya uygun degerleri girerek login olun
    //        // "Login Successful :)
    //" yazisinin gorunurlugunu dogrulayin
    //        // "Click here to go back to the home page" yazisinde bulunan
    //        //              "here" linkini kullanarak ana sayafaya donun
    //        // Ana sayfaya dondugunuzu dogrulayin

    @Test
    public void Test01(){
        // https://trytestingthis.netlify.app/ adresine gidin
        driver.get("https://trytestingthis.netlify.app/");
        // "Your Website to practice Automation Testing" gorundugunu dogrulayin
        WebElement webYazi= driver.findElement(By.xpath("//div[@class='header']"));
        Assert.assertTrue(webYazi.isDisplayed());
        //        // "This is your Sample login page" de bulunan "username" ve "password" de
        //        //              aciklamaya uygun degerleri girerek login olun
        driver.findElement(By.id("fname")).sendKeys("username");
        driver.findElement(By.id("lname")).sendKeys("password");


    }
}
