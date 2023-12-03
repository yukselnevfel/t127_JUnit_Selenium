package tests.day12_webTables_excelOtomasyon.Grup_Calismalari;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

public class deneme {
    //1. Launch browser
    @Test
    public void Test01() {

        //2. Navigate to url 'http://automationexercise.com'
       // driver.get("http://automationexercise.com");
        //3. Verify that home page is visible successfully
       // String actualBaslik = driver.getTitle();
        String expectedBaslik = "Automation Exercise";
       // Assert.assertTrue(actualBaslik.equals(expectedBaslik));
        //4. Click on 'Test Cases' button
      //  driver.findElement(By.xpath("(//i[@class='fa fa-list'])[1]")).click();
        //5. Verify user is navigated to test cases page successfully
       // WebElement expectedTestcaseTitle = driver.findElement(By.xpath("//h2[@class='title text-center']"));
       // Assert.assertTrue(expectedTestcaseTitle.isDisplayed());

    }
}