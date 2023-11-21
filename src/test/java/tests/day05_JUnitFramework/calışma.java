package tests.day05_JUnitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class calışma {
    public static void main(String[] args) {

        //  1. Launch browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //  2. Navigate to url 'http://automationexercise.com'

        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        WebElement homePage = driver.findElement(By.tagName("h1"));
        if (homePage.isDisplayed()) {
            System.out.println("Homepage testi PASSED");
        } else {
            System.out.println("Homepage testi FAİLED");
        }
        // 4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[@href='/login']")).click();

        //5. Verify 'New User Signup!' is visible

        // 6. Enter name and email address
        // 7. Click 'Signup' button
        // 8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        //9. Fill details: Title, Name, Email, Password, Date of birth
        //  10. Select checkbox 'Sign up for our newsletter!'
        // 11. Select checkbox 'Receive special offers from our partners!'
        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        // 13. Click 'Create Account button'
        // 14. Verify that 'ACCOUNT CREATED!' is visible
        // 15. Click 'Continue' button
        // 16. Verify that 'Logged in as username' is visible
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