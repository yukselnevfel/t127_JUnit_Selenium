package tests.day05_JUnitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Odev_saucedemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

   // 1. “https://www.saucedemo.com” Adresine gidin
        driver.get("https://www.saucedemo.com");
   // 2. Username kutusuna “standard_user” yazdirin
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
   //3. Password kutusuna “secret_sauce” yazdirin
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
   //4. Login tusuna basin
        driver.findElement(By.id("login-button")).click();
   //5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        WebElement ilkUrun=driver.findElement(By.id("item_4_title_link"));
        System.out.println(ilkUrun.getText());
        ilkUrun.click();
        Thread.sleep(2000);
   //6. Add to Cart butonuna basin
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
   //7. Alisveris sepetine tiklayin
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        Thread.sleep(2000);
   //8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        WebElement bagEklemeKontrol= driver.findElement(By.xpath("//div[@class='cart_item_label']"));
        Assert.assertTrue(bagEklemeKontrol.isDisplayed());
        Thread.sleep(2000);
   //9. Sayfayi kapatin
      driver.quit();

    }
}
