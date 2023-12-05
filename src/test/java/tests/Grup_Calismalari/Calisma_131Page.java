package tests.Grup_Calismalari;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Calisma_131Page extends TestBase {

    @Test
    public void test131(){
        //Yeni bir class olusturalim: MouseActions3
        //1- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        //2- Sag ust bolumde bulunan “Account & Lists” menusunun acilmasi icin
        //mouse’u bu menunun ustune getirin
        Actions actions=new Actions(driver);
        WebElement accountListYazisi=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
        actions.moveToElement(accountListYazisi).perform();
        //3- “Create a list” butonuna basin
        driver.findElement(By.xpath("//span[text()='Create a List']")).click();
        //4- Acilan sayfada “Your Lists” yazisi oldugunu test edin
        WebElement yourlistYazisi= driver.findElement(By.xpath("//div[@role='heading']"));
        String expectedList="Your Lists";
        String actualList=yourlistYazisi.getText();
        Assert.assertEquals(expectedList,actualList);
    }
}
