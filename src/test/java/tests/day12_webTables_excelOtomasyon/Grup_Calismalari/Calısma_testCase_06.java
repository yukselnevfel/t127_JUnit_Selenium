package tests.day12_webTables_excelOtomasyon.Grup_Calismalari;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase;

public class Calısma_testCase_06 extends TestBase {

    @Test
    public  void test06(){

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        WebElement homePage =driver.findElement(By.xpath("//ul[@class='nav navbar-nav']"));
        Assert.assertTrue(homePage.isDisplayed());
        ReusableMethods.bekle(3);
        //4. Click on 'Contact Us' button
        driver.findElement(By.xpath("//i[@class='fa fa-envelope']")).click();
        //5. Verify 'GET IN TOUCH' is visible
        WebElement getTocchTesti=driver.findElement(By.xpath("//h2[text()='Get In Touch']"));
        Assert.assertTrue(getTocchTesti.isDisplayed());
        //6. Enter name, email, subject and message
        //7. Upload file
        WebElement nameTest= driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
        Actions actions=new Actions(driver);
        actions.click(nameTest).sendKeys("Nevfel").sendKeys(Keys.TAB).sendKeys("lefven.1@gmail.com").sendKeys(Keys.TAB)
                .sendKeys("Problem yok!").sendKeys(Keys.TAB).sendKeys("Her şey kontrol altında:)").sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).sendKeys("\"C:\\Users\\Pc\\Desktop\\work\"").perform();
        //8. Click 'Submit' button
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        //9. Click OK button
        driver.switchTo().alert().accept();
        //10. Verify success message 'Success! Your details have been submitted successfully.' is visible
        WebElement succesMessage= driver.findElement(By.xpath("//div[@class='status alert alert-success']"));
        Assert.assertTrue(succesMessage.isDisplayed());
        //11. Click 'Home' button and verify that landed to home page successfully
        WebElement homeSon=driver.findElement(By.xpath("//i[@class='fa fa-angle-double-left']"));
        Assert.assertTrue(homeSon.isDisplayed());
    }
}
