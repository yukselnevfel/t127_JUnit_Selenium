package tests.day07_testBaseClass_Dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;

import java.time.Duration;

public class C01_RadioButton {
    //Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.

    WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @After
    public void teardown(){
        driver.close();
    }

    @Test
    public void radioButtonKutuTesti(){
       // JavascriptExecutor jse = (JavascriptExecutor) driver;
        //	a. Verilen web sayfasına gidin.
        //	      https://testotomasyonu.com/form
        driver.get("https://testotomasyonu.com/form");
        //	b. Cinsiyet Radio button elementlerini locate edin ve
        //     radio buttonu isaretleyerek size uygun olani secin
        WebElement kadinRadioButton = driver.findElement(By.id("inlineRadio1"));
        WebElement erkekRadioButton = driver.findElement(By.id("inlineRadio2"));
        WebElement digerRadioButton = driver.findElement(By.id("inlineRadio3"));
        ReusableMethods.bekle(2);

        erkekRadioButton.sendKeys(Keys.PAGE_DOWN);
      //  jse.executeScript("arguments[0].click();",erkekRadioButton);
        ReusableMethods.bekle(2);
        erkekRadioButton.click();
        ReusableMethods.bekle(2);


        //	c. Sectiginiz radio button’un seçili, ötekilerin seçili olmadigini test edin

        Assert.assertTrue(erkekRadioButton.isSelected());
        Assert.assertFalse(kadinRadioButton.isSelected());
        Assert.assertFalse(digerRadioButton.isSelected());
        ReusableMethods.bekle(2);
    }

    @Test
    public void radioButtonYaziTesti(){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //	a. Verilen web sayfasına gidin.
        //	      https://testotomasyonu.com/form
        driver.get("https://testotomasyonu.com/form");
        //	b. Cinsiyet Radio button elementlerini locate edin ve
        //     yaziyi click ederek size uygun olani secin

        // secimi yazi ile yapabilirim
        // ama assertion'lar icin radio button'lara ihtiyacimiz var
        WebElement erkekRadioButtonYaziElementi = driver.findElement(By.xpath("//*[@for='inlineRadio2']"));
        ReusableMethods.bekle(2);
        //erkekRadioButtonYaziElementi.sendKeys(Keys.PAGE_DOWN);
        jse.executeScript("arguments[0].click();",erkekRadioButtonYaziElementi);
        ReusableMethods.bekle(2);
        //erkekRadioButtonYaziElementi.click();
        ReusableMethods.bekle(2);
        WebElement kadinRadioButton = driver.findElement(By.id("inlineRadio1"));
        WebElement erkekRadioButton = driver.findElement(By.id("inlineRadio2"));
        WebElement digerRadioButton = driver.findElement(By.id("inlineRadio3"));

        //	c. Sectiginiz radio button’un seçili, ötekilerin seçili olmadigini test edin
        Assert.assertTrue(erkekRadioButton.isSelected());
        Assert.assertFalse(kadinRadioButton.isSelected());
        Assert.assertFalse(digerRadioButton.isSelected());
        ReusableMethods.bekle(2);
    }
}



