package tests.day12_webTables_excelOtomasyon.Grup_Calismalari;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Calisma_testCase_07 extends TestBase {

    //1. Launch browser
    @Test
    public  void Test01(){

    //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
    //3. Verify that home page is visible successfully
        String homepageTitle= driver.getTitle();
        String expectedTitle="Automation Exercise";
        Assert.assertEquals(expectedTitle,homepageTitle);

        //4. Click on 'Test Cases' button
        driver.findElement(By.xpath("(//a[@href='/test_cases'])[1]")).click();
        System.out.println(driver.getCurrentUrl());
        //5. Verify user is navigated to test cases page successfully
        String expectedUrl="https://automationexercise.com/test_cases";
        Assert.assertTrue(expectedUrl.contains(driver.getCurrentUrl()));
        Assert.assertTrue("Şu an anasayfada değiliz",homepageTitle.contains(driver.getTitle()));



    }









}



