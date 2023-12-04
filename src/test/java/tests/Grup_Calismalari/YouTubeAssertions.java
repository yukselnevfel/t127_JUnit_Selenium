package tests.Grup_Calismalari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class YouTubeAssertions {

    // 1-Bir class olusturun: YoutubeAssertions
    // 2-https://www.youtube.com adresine gidin
    // 3-Asagidaki adlari kullanarak 4 test methodu olusturun ve gerekli testleri yapin.
    // --titleTest ==> Sayfa baslıgının "YouTube" oldugunu test edin
    // --imageTest ==> YouTube resminin görüntülendigini (isDisplayed()) test edin
    // --Search Box 'in erisilebilir oldugunu test edin(isEnabled())
    // --wrongTitleTest ==> Sayfa baslıgının 'youtube'olmadıgını dogrulayin.

    static WebDriver driver;
    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        driver.get("https://www.youtube.com");

    }
    @AfterClass
    public static void teardown(){
        driver.quit();
    }
    @Test
    public void titleTest(){
        // --titleTest ==> Sayfa baslıgının "YouTube" oldugunu test edin
        String actualTitle=driver.getTitle();
        String expectedTitle="YouTube";
        Assert.assertTrue(actualTitle.equals(expectedTitle));


    }
    @Test
    public void imageTest(){
        // --imageTest ==> YouTube resminin görüntülendigini (isDisplayed()) test edin
        WebElement image=driver.findElement(By.xpath("(//yt-icon[@id='logo-icon'])[1]"));
        Assert.assertTrue(image.isDisplayed());
        driver.switchTo().newWindow(WindowType.WINDOW);

    }
    @Test
    public void searcboxTest(){
        // --Search Box 'in erisilebilir oldugunu test edin(isEnabled())
        WebElement serchbox=driver.findElement(By.xpath("//input[@id='search']"));
        Assert.assertTrue(serchbox.isEnabled());


    }
    @Test
    public void wrongtitleTest(){
// --wrongTitleTest ==> Sayfa baslıgının 'youtube'olmadıgını dogrulayin.
        String actualTitle =driver.getTitle();
        String unexpectedTitle="youtube";
        Assert.assertNotEquals(unexpectedTitle,actualTitle);

    }

}
