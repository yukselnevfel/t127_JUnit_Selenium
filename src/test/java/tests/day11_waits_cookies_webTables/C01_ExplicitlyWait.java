package tests.day11_waits_cookies_webTables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ReusableMethods;

import java.time.Duration;

public class C01_ExplicitlyWait {

    //1. Bir class olusturun : WaitTest
    //2. Iki tane metod olusturun : implicitWait() , explicitWait()
    //  Iki metod icin de asagidaki adimlari test edin.
    //3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
    //4. Remove butonuna basin.
    //5. “It’s gone!” mesajinin goruntulendigini dogrulayin.
    //6. Add buttonuna basin
    //7. It’s back mesajinin gorundugunu test edin

    @Test
    public  void  implicitlyWaitTesti(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        //4. Remove butonuna basin.
        ReusableMethods.bekle(5);
        driver.findElement(By.xpath("//*[text()='Remove']")).click();
        //5. “It’s gone!” mesajinin goruntulendigini dogrulayin.
        WebElement itsGoneYaziElementi= driver.findElement(By.xpath("//*[text()=It’s gone!“]"));
        Assert.assertTrue(itsGoneYaziElementi.isDisplayed());
        //6. Add buttonuna basin
        driver.findElement(By.xpath("//*[text()=“Add”]"));
        //7. It’s back mesajinin gorundugunu test edin
        WebElement itsBackElementi=driver.findElement(By.xpath("//*[text()=\"It’s gone!\"]"));
        Assert.assertTrue(itsBackElementi.isDisplayed());
        driver.quit();
    }
    @Test
    public void explicitlyWaitTesti(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        //4. Remove butonuna basin.
        ReusableMethods.bekle(5);
        driver.findElement(By.xpath("//*[text()='Remove']")).click();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        WebElement itsGoneYaziElementi= driver.findElement(By.xpath("//*[text()=\"It’s gone!\"]"));
    }
}
