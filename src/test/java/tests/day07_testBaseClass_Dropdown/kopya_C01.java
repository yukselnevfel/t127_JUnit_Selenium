package tests.day07_testBaseClass_Dropdown;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.ReusableMethods;
import utilities.TestBase;
public class kopya_C01 extends TestBase {
    @Test
    public void denemeTest(){
    //1. http://zero.webappsecurity.com/ Adresine gidin
        driver.get("http://zero.webappsecurity.com/");

    //2. Sign in butonuna basin
        driver.findElement(By.id("signin_button")).click();

    //3. Login kutusuna “username” yazin
        driver.findElement(By.id("user_login")).sendKeys("username");
    //4. Password kutusuna “password” yazin
        driver.findElement(By.id("user_password")).sendKeys("password");
    //5. Sign in tusuna basin, back tusuna basarak sayfaya donun
        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
        driver.navigate().back();
    //6. Online banking menusunden Pay Bills sayfasina gidin
        driver.findElement(By.id("onlineBankingMenu")).click();
        driver.findElement(By.id("pay_bills_link")).click();

    //7. “Purchase Foreign Currency” tusuna basin
        driver.findElement(By.linkText("Purchase Foreign Currency")).click();
        ReusableMethods.bekle(3);
    //8. “Currency” dropdown menusunden Eurozone’u secin
        WebElement euroZone=driver.findElement(By.id("pc_currency"));
        Select selecteuro=new Select(euroZone);
        selecteuro.selectByValue("EUR");
    //9. “amount” kutusuna bir sayi girin
        driver.findElement(By.id("pc_amount")).sendKeys("500");
    //10. currency olarak “US Dollars” in secilmedigini test edin
        WebElement UsDolar= driver.findElement(By.xpath("(//label[@class='radio inline'])[2]"));
        Assert.assertFalse(UsDolar.isSelected());
    // Radio button  U.S. Dollars'in secilmedigini test edin
        WebElement radioButton=driver.findElement(By.id("pc_inDollars_true"));
        Assert.assertFalse(radioButton.isSelected());

    //11. “Selected currency” butonunu secin

    //12. “Calculate Costs” butonuna basin sonra “purchase” butonuna basin

    //13. “Foreign currency cash was successfully purchased.” yazisinin ciktigini kontrol edin.
    }
    }

