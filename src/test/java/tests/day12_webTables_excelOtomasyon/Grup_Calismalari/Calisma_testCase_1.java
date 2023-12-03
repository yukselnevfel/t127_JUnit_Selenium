package tests.day12_webTables_excelOtomasyon.Grup_Calismalari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Calisma_testCase_1 {
    public static void main(String[] args) {

        //  1. Launch browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //  2. Navigate to url 'http://automationexercise.com'

        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        WebElement homePage = driver.findElement(By.xpath("//a[@style='color: orange;']"));
        if (homePage.isDisplayed()) {
            System.out.println("Homepage testi PASSED");
        } else {
            System.out.println("Homepage testi FAİLED");
        }
        // 4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();

        //5. Verify 'New User Signup!' is visible
        WebElement kullaniciGorunum=driver.findElement(By.xpath("//h2[text()='New User Signup!']"));
        if (kullaniciGorunum.isDisplayed()){
            System.out.println("Kullanici görünüm testi PASSED");
        }else {
            System.out.println("Kullanici görünüm testi FAİLED");
            System.out.println("Kullanıcı görunum "+kullaniciGorunum);
        }
        // 6. Enter name and email address
        WebElement name=driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
        name.sendKeys("nevfel");
        WebElement email=driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
        email.sendKeys("lefvn.1@gmail.com");
        // 7. Click 'Signup' button
       driver.findElement(By.xpath("//button[@ data-qa='signup-button']")).click();
        // 8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement enterAccountYazi=driver.findElement(By.xpath("(//h2[@class='title text-center'])[1]"));
       Assert.assertTrue(enterAccountYazi.isDisplayed());
        //9. Fill details: Title, Name, Email, Password, Date of birth
        driver.findElement(By.xpath("//label[@for='id_gender1']")).click();
        driver.findElement(By.xpath("(//div[@class='required form-group'])[1]")).click();
        //driver.findElement(By.xpath("(//div[@class='required form-group'])[2]")).sendKeys();//email
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("nevfel123");
        driver.findElement(By.xpath("//select[@id='days']")).sendKeys("1");
        driver.findElement(By.xpath("//select[@id='months']")).sendKeys("May");
        driver.findElement(By.xpath("//select[@id='years']")).sendKeys("1991");
        //  10. Select checkbox 'Sign up for our newsletter!'
        driver.findElement(By.xpath("(//div[@class='checkbox'])[1]")).click();
        // 11. Select checkbox 'Receive special offers from our partners!'
        driver.findElement(By.xpath("(//div[@class='checkbox'])[2]")).click();
        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        driver.findElement(By.id("first_name")).sendKeys("nevfel");
        driver.findElement(By.id("last_name")).sendKeys("deniz");
        driver.findElement(By.id("company")).sendKeys("WQ");
        driver.findElement(By.id("address1")).sendKeys("istanbul");
        driver.findElement(By.id("address2")).sendKeys("kadikoy");
        driver.findElement(By.id("country")).sendKeys("Turkey");
        driver.findElement(By.xpath("//*[@id='state']")).sendKeys("Marmara");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("istanbul");
        driver.findElement(By.id("zipcode")).sendKeys("34560");
        driver.findElement(By.id("mobile_number")).sendKeys("5555555554");
        // 13. Click 'Create Account button'
        driver.findElement(By.xpath("(//button[@class='btn btn-default'])[1]")).click();
        // 14. Verify that 'ACCOUNT CREATED!' is visible
        WebElement basariliGiris=driver.findElement(By.xpath("//h2[@class='title text-center']"));
      Assert.assertTrue(basariliGiris.isDisplayed());
        // 15. Click 'Continue' button
        driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
        // 16. Verify that 'Logged in as username' is visible
        WebElement loggedIUN=driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        Assert.assertTrue(loggedIUN.isDisplayed());
        // 17. Click 'Delete Account' button
        // 18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button


        //  2. 'http://automationexercise.com' URL'sine gidin
        // 3 Ana sayfanın başarıyla göründüğünü doğrulayın
        // 4. 'Kayıt Ol / Giriş Yap' butonuna tıklayın
        //5. 'Yeni Kullanıcı Kaydı!' seçeneğini doğrulayın görünür
        //6. Adı ve e-posta adresini girin
        //7. 'Kayıt Ol' butonuna tıklayın
        //8. 'HESAP BİLGİLERİNİ GİRİN' seçeneğinin göründüğünü doğrulayın
        //9. Ayrıntıları girin: Unvan, İsim, E-posta, Şifre, Doğum Tarihi
        //10. 'Bültenimize kaydolun!' onay kutusunu seçin.
        //11. 'Ortaklarımızdan özel teklifler alın!' onay kutusunu seçin.
        //12. Ayrıntıları doldurun: Ad, Soyadı, Şirket, Adres, Adres2, Ülke, Eyalet, Şehir, Posta Kodu, Cep Numarası
        //13. 'Hesap Oluştur düğmesi'ne tıklayın
        //14. 'HESAP OLUŞTURULDU!' ifadesini doğrulayın. görünür
        //15. 'Devam' düğmesine tıklayın
        //16. 'Kullanıcı adı olarak oturum açıldı' seçeneğinin görünür olduğunu doğrulayın
        //17. 'Hesabı Sil' butonuna tıklayın
        //18. 'HESAP SİLİNDİ!' seçeneğini doğrulayın. görünür ve 'Devam' düğmesine tıklayın
    }
}