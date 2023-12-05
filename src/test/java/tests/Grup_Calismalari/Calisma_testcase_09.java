package tests.Grup_Calismalari;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static tests.Grup_Calismalari.Calisma_testCase_02.driver;

public class Calisma_testcase_09 extends TestCase {

    @Test
    public void Test09(){

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        WebElement homePageTitle= driver.findElement(By.xpath("//i[@class='fa fa-home']"));
        Assert.assertTrue(homePageTitle.isDisplayed());
        //4. Click on 'Products' button
        driver.findElement(By.xpath("//a[@href='/products']")).click();
        //5. Verify user is navigated to ALL PRODUCTS page successfully
        WebElement AllProductsPage=driver.findElement(By.xpath("//h2[@class='title text-center']"));
        Assert.assertTrue(AllProductsPage.isDisplayed());
        //6. Enter product name in search input and click search button
        //7. Verify 'SEARCHED PRODUCTS' is visible
        //8. Verify all the products related to search are visible
    }
}
