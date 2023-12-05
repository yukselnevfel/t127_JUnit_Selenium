package tests.Grup_Calismalari;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

public class Calisma_testCase_11 extends TestBase {

    @Test
    public void Test11(){

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("https://automationexercise.com");
        //3. Verify that home page is visible successfully
        String actualUrl= driver.getCurrentUrl();
        String expectedUrl="https://automationexercise.com/";
        Assert.assertEquals(expectedUrl,actualUrl);
        //4. Click 'Cart' button
        driver.findElement(By.xpath("(//a[@href='/view_cart'])[1]")).click();
        //5. Scroll down to footer
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.END).perform();
        //6. Verify text 'SUBSCRIPTION'
        WebElement textSub= driver.findElement(By.className("single-widget"));
        Assert.assertTrue(textSub.isDisplayed());
        //7. Enter email address in input and click arrow button
        driver.findElement(By.id("susbscribe_email")).sendKeys("lefven.1@gmail.com");
        driver.findElement(By.id("subscribe")).click();
        //8. Verify success message 'You have been successfully subscribed!' is visible
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement message=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("success-subscribe")));
        String expectedMessage="You have been successfully subscribed!";
        String actualMessage=message.getText();
        System.out.println(actualMessage);
        Assert.assertEquals(expectedMessage,actualMessage);
    }
}
