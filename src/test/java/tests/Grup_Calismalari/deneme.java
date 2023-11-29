package tests.Grup_Calismalari;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

public class deneme extends TestBase {

    // Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.

    @Test
    public void facebookRadioButton() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        // 	a. Verilen web sayfasına gidin.
        // 	     https://facebook.com
        driver.get("https://facebook.com");

        // 	b. Cookies’i kabul edin


        // 	c. Create an account buton’una basin
        driver.findElement(By.xpath("//a[@class='_42ft 4jy0 6lti 4jy6 4jy2 selected _51sy']")).click();

        // 	d. Radio button elementlerini locate edin ve size uygun olani secin
        WebElement kadinRB = driver.findElement(By.xpath("(//span[@class='_5k_2 _5dba'])[1]"));
        WebElement erkekRB = driver.findElement(By.xpath("(//span[@class='_5k_2 _5dba'])[2]"));
        WebElement ozelRB = driver.findElement(By.xpath("(//span[@class='_5k_2 _5dba'])[3]"));

        erkekRB.click();

        Assert.assertTrue(erkekRB.isSelected());
        jse.executeScript("arguments[0].isSelected();", erkekRB);
        Assert.assertFalse(kadinRB.isSelected());
        Assert.assertFalse(ozelRB.isSelected());


        ReusableMethods.bekle(3);
    }
}