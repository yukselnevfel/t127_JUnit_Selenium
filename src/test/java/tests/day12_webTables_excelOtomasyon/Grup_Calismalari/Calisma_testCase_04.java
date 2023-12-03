package tests.day12_webTables_excelOtomasyon.Grup_Calismalari;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;
import utilities.TestBase_BeforeClass;

public class Calisma_testCase_04 extends TestBase {

    //1. Launch browser
        //Extends yaptım

    @Test
    public void test01(){
    //2. Navigate to url 'http://automationexercise.com'
  driver.get("http://automationexercise.com");
    //3. Verify that home page is visible successfully
        WebElement homePage=driver.findElement(By.xpath("//i[@class='fa fa-home']"));

        Assert.assertTrue(homePage.isDisplayed());
        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[@href='/login']")).click();


    //5. Verify 'Login to your account' is visible
        WebElement loginTo = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
       loginTo.getText();
       String expectedIcerik="Login to your account";
       String actualIcerik= loginTo.getText();
       Assert.assertEquals(expectedIcerik,actualIcerik);
    //6. Enter correct email address and password
driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys("lefven.1@gmail.com");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("nevfel123");
            //7. Click 'login' button
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

    //8. Verify that 'Logged in as username' is visible
       WebElement loggetUn= driver.findElement(By.xpath("//i[@class='fa fa-user']"));
       Assert.assertTrue(loggetUn.isDisplayed());
    //9. Click 'Logout' button
     driver.findElement(By.xpath("//a[@href='/logout']")).click();
    //10. Verify that user is navigated to login page
        WebElement homepageReturn =driver.findElement(By.xpath("//i[@class='fa fa-home']"));
        Assert.assertTrue(homepageReturn.isDisplayed());
    }
}
