package tests.day05_JUnitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethods;

import java.time.Duration;

public class deneme {
    public static void main(String[] args) throws InterruptedException {

    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");
//2. Signin buttonuna tiklayin
        driver.findElement(By.id("signin_button")).click();
//3. Login alanine  “username” yazdirin
       WebElement kullaniciAdi= driver.findElement(By.id("user_login"));
       kullaniciAdi.sendKeys("username");
//4. Password alanina “password” yazdirin
        WebElement kullaniciSoyadi= driver.findElement(By.id("user_password"));
        kullaniciSoyadi.sendKeys("password");
//5. Sign in buttonuna tiklayin
        driver.findElement(By.xpath("//input[@value='Sign in']")).click();
//6. Back tusu ile sayfaya donun
        driver.navigate().back();
//7. Online Banking menusunden Pay Bills sayfasina gidin
        driver.findElement(By.id("onlineBankingMenu")).click();
        driver.findElement(By.id("pay_bills_link")).click();
//8. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        WebElement yatirilanPara =driver.findElement(By.id("sp_amount"));
        yatirilanPara.sendKeys("200");
//9. tarih kismina “2023-09-10” yazdirin
        WebElement tarih =driver.findElement(By.id("sp_date"));
        tarih.sendKeys("2023-09-10");
//10. Pay buttonuna tiklayin
        driver.findElement(By.id("pay_saved_payees")).click();
//11. “The payment was successfully submitted.” mesajinin ciktigini test edin
        WebElement sonuc= driver.findElement(By.xpath("//span[text()='The payment was successfully submitted.']"));
        sonuc.getText();
        String expectedSonuc="The payment was successfully submitted.";
        String actualSonuc=sonuc.getText();
        if (expectedSonuc.equals(actualSonuc)){
            System.out.println("Sonuç testi PASSED");
        }else {
            System.out.println("Sonuc testi FAİLED");
            System.out.println("sonuc testi:" +actualSonuc);
        }

        ReusableMethods.bekle(3);
        driver.quit();
    }
}