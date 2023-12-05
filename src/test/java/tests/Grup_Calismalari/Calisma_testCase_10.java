package tests.Grup_Calismalari;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

public class Calisma_testCase_10 extends TestBase {

    @Test
    public void test10(){

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        String actualTitle= driver.getTitle();
        String expectedTitle="Automation Exercise";
        Assert.assertEquals(expectedTitle,actualTitle);
        //4. Scroll down to footer
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.END).perform();
        //JavascriptExecutor js= (JavascriptExecutor) driver;
       // js.executeScript("window.scrollTo(0,")
        //5. Verify text 'SUBSCRIPTION'
        WebElement subscription= driver.findElement(By.className("single-widget"));
        Assert.assertTrue(subscription.isDisplayed());
        //6. Enter email address in input and click arrow button
        driver.findElement(By.id("susbscribe_email")).sendKeys("lefven1.@gmail.com");
        driver.findElement(By.id("subscribe")).click();
        //7. Verify success message 'You have been successfully subscribed!' is visible
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement message=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("success-subscribe")));
        String expectedMessage="You have been successfully subscribed!";
        String actualMessage=message.getText();
        System.out.println(actualMessage);
        Assert.assertEquals(expectedMessage,actualMessage);
    }
}
