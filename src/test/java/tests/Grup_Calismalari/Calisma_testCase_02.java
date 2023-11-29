package tests.Grup_Calismalari;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.AssertionFailedError;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Calisma_testCase_02 {

    //1. Launch browser
    //2. Navigate to url 'http://automationexercise.com'
    //3. Verify that home page is visible successfully
    //4. Click on 'Signup / Login' button
    //5. Verify 'Login to your account' is visible
    //6. Enter correct email address and password
    //7. Click 'login' button
    //8. Verify that 'Logged in as username' is visible
    //9. Click 'Delete Account' button
    //10. Verify that 'ACCOUNT DELETED!' is visible



      //2. 'http://automationexercise.com' URL'sine gidin
      // 3. Ana sayfanın başarıyla göründüğünü doğrulayın
      //4. 'Kayıt Ol / Giriş Yap' butonuna tıklayın
      //5. 'Hesabınıza giriş yapın' seçeneğinin görünür olduğunu doğrulayın
      //6. Doğru e-posta adresini ve şifreyi girin
      //7. 'Giriş yap' düğmesine tıklayın
      //8. 'Kullanıcı adı olarak oturum açıldı' seçeneğinin göründüğünü doğrulayın
       //9. 'Hesabı Sil' düğmesine tıklayın
       //10. 'HESAP SİLİNDİ!' seçeneğini doğrulayın. görünür


    static  WebDriver driver;
    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://automationexercise.com");
    }
    @AfterClass
    public static void teardown(){
        driver.quit();
    }
    @Test
    public void test01(){
        // 3. Ana sayfanın başarıyla göründüğünü doğrulayın
        WebElement anaSayfaGorunum=driver.findElement(By.xpath("//a[@style='color: orange;']"));
        if (anaSayfaGorunum.isDisplayed()){
            System.out.println("Anasayfa görünüm testi PASSED");
        }else {
            System.out.println("Anasayfa görünüm testi FAİLED");
            throw new AssertionFailedError();
        }

    }
    @Test
    public void test02(){
        //4. 'Kayıt Ol / Giriş Yap' butonuna tıklayın
        driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();
        //5. 'Hesabınıza giriş yapın' seçeneğinin görünür olduğunu doğrulayın
        WebElement gorunurlulukTesti=driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        if (gorunurlulukTesti.isDisplayed()){
            System.out.println("Hesaba giriş testi PASSED");

        }else {
            System.out.println("Hesaba giriş testi FAİLED");

        }
    }
    @Test
    public void test03(){
        //6. Enter correct email address and password
        driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys("nevfel303@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("javacandir");
        //7. Click 'login' button
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
        //8. Verify that 'Logged in as username' is visible
        WebElement loggedUserName =driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        Assert.assertTrue(loggedUserName.isDisplayed());
    }
    @Test
    public void test04(){
        //9. Click 'Delete Account' button
        driver.findElement(By.xpath("(//a[@style='color:brown;'])[2]")).click();
        //10. Verify that 'ACCOUNT DELETED!' is visible
        WebElement accountDeletedYazi=driver.findElement(By.xpath("//h2[@class='title text-center']"));
        Assert.assertTrue(accountDeletedYazi.isDisplayed());
    }


}
