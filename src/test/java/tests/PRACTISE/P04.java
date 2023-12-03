package tests.PRACTISE;

import com.github.javafaker.Faker;
import org.checkerframework.dataflow.qual.TerminatesExecution;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class P04 extends TestBase {
    @Test
    public void aeSignup(){

        Faker faker=new Faker();
    // 1-https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");
    // 2-Sign-up  butonuna basınız
        driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();
    // 3-Üye Kayıt sayfasında "New User Signup!" yazısının göründüğünü doğrulayın
        String expectedIcerik="New User Signup!";
        String actualIcerik=driver.findElement(By.xpath("(//h2)[3]")).getText();
        Assert.assertEquals(expectedIcerik,actualIcerik);
    // 4-üye kaydı işlemini başlatın
        driver.findElement(By.xpath("//*[@data-qa='signup-name']")).sendKeys("isim");
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("dnz@.com");
        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
    // 5-Üye kayit formunu doldurun
    // 6-Üye kaydinin yapildiği mesajının göründğünü doğrulayın

    }
}
