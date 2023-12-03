package tests.Grup_Calismalari;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Calisma_testCase_08 extends TestBase {


    @Test
    public  void  test08(){

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        String actualHomePageTitle= driver.getTitle();
        String expectedHomeTitle="Automation Exercise";
        Assert.assertEquals(expectedHomeTitle,actualHomePageTitle);
        //4. Click on 'Products' button
        driver.findElement(By.xpath("//a[@href='/products']")).click();
        //5. Verify user is navigated to ALL PRODUCTS page successfully
        WebElement productsPage=driver.findElement(By.xpath("//h2[@class='title text-center']"));
        Assert.assertTrue(productsPage.isDisplayed());
        //6. The products list is visible
        WebElement urunlistesi= driver.findElement(By.xpath("//div[@class='features_items']"));
        Assert.assertTrue(urunlistesi.isDisplayed());
        //7. Click on 'View Product' of first product
        driver.findElement(By.xpath("//a[@href='/product_details/1']")).click();
        //8. User is landed to product detail page
        String detailPage= driver.getTitle();
        System.out.println(detailPage);
        String expectedDetailPage="Automation Exercise - Product Details";
        Assert.assertEquals(expectedDetailPage,detailPage);
        //9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
        WebElement detailSayfa= driver.findElement(By.xpath("//div[@class='product-information']"));
        Assert.assertTrue(detailSayfa.isDisplayed());


    }
}
