package tests.PRACTISE;

import com.github.javafaker.Faker;
import org.checkerframework.dataflow.qual.TerminatesExecution;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import static org.junit.Assert.assertEquals;

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
       assertEquals(expectedIcerik,actualIcerik);
    // 4-üye kaydı işlemini başlatın
        String firstName=faker.name().firstName();
        String lastName=faker.name().lastName();
        String email=faker.internet().emailAddress();
        driver.findElement(By.xpath("//*[@data-qa='signup-name']")).sendKeys(firstName+" "+lastName);
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys(email);
        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
    // 5-Üye kayit formunu doldurun
        driver.findElement(By.id("id_gender1")).click();
        String password=faker.internet().password();
        driver.findElement(By.id("password")).sendKeys(password);

        WebElement days= driver.findElement(By.id("days"));
        Select selectGun=new Select(days);
        selectGun.selectByValue("5");
        WebElement months= driver.findElement(By.id("months"));
        Select selectAy=new Select(months);
        selectAy.selectByVisibleText("June");
        WebElement years= driver.findElement(By.id("years"));
        Select selectYil=new Select(years);
        selectYil.selectByIndex(1);
        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("optin")).click();
        driver.findElement(By.id("first_name")).sendKeys(firstName);
        driver.findElement(By.id("last_name")).sendKeys(lastName);
        driver.findElement(By.id("company")).sendKeys("WQ");
        String adres=faker.address().streetAddress();
        driver.findElement(By.id("address1")).sendKeys(adres);
        WebElement country= driver.findElement(By.id("country"));
        Select selectCountry=new Select(country);
        selectCountry.selectByVisibleText("Canada");
        String state=faker.address().state();
        driver.findElement(By.id("state")).sendKeys(state);
        String city=faker.address().city();
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);
        String zipCode=faker.address().zipCode();
        driver.findElement(By.id("zipcode")).sendKeys(zipCode);
        String mobilePhone=faker.phoneNumber().phoneNumber();
        driver.findElement(By.id("mobile_number")).sendKeys(mobilePhone);
        driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
        // 6-Üye kaydinin yapildiği mesajının göründğünü doğrulayın
        WebElement message= driver.findElement(By.xpath("//h2[@data-qa='account-created']"));
        String actualMessage=message.getText();
        String expectedMessage="ACCOUNT CREATED!";
        Assert.assertEquals(expectedMessage,actualMessage);


    }
}
