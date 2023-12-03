package tests.day12_webTables_excelOtomasyon.Grup_Calismalari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Calisma_testCase_03 {

    //1. Launch browser
    //2. Navigate to url 'http://automationexercise.com'
    //3. Verify that home page is visible successfully
    //4. Click on 'Signup / Login' button
    //5. Verify 'Login to your account' is visible
    //6. Enter incorrect email address and password
    //7. Click 'login' button
    //8. Verify error 'Your email or password is incorrect!' is visible

   static WebDriver driver;
    @BeforeClass
    public static void setup(){
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        driver.get("http://automationexercise.com");
    }
    @AfterClass
    public static void teardown(){
        driver.quit();
    }
    @Test
    public void homepageTest(){
        //3. Verify that home page is visible successfully
        WebElement homePageVisibile =driver.findElement(By.xpath("//a[@style='color: orange;']"));
        Assert.assertTrue(homePageVisibile.isDisplayed());
        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
    }
    @Test
    public void loginTest (){
        //5. Verify 'Login to your account' is visible
        WebElement loginAccountTest=driver.findElement(By.tagName("h2"));
        Assert.assertTrue(loginAccountTest.isDisplayed());
    }
    @Test
    public void incorrectTest(){
        //6. Enter incorrect email address and password
        driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys("nevfell16@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1991nevfel");
        //7. Click 'login' button
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
        //8. Verify error 'Your email or password is incorrect!' is visible
        WebElement incorrectYaziElementi= driver.findElement(By.xpath("//p[text()='Your email or password is incorrect!']"));
        Assert.assertTrue(incorrectYaziElementi.isDisplayed());
    }
}

