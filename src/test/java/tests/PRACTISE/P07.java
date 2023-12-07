package tests.PRACTISE;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

public class P07 extends TestBase {

    //https://the-internet.herokuapp.com/upload adresine gidelim
    //Bilgisayarımızdaki herhangi bir dosyayı buraya yükleyelim
    //drag-drop-upload - file-upload
    @Test
    public void fileUploadTest(){
        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement chooseFile= driver.findElement(By.id("file-upload"));
        //WebElement chooseFile= driver.findElement(By.id("drag-drop-upload"));

        String dosyaYolu="C:\\Users\\murat\\IdeaProjects\\team127_JUnit_Winter2023\\src\\test\\java\\utilities\\wqlogo.png";
        chooseFile.sendKeys(dosyaYolu);
        ReusableMethods.bekle(3);

        driver.findElement(By.id("file-submit")).click();

        WebElement fileUploaded= driver.findElement(By.xpath("(//h3)[1]"));

        Assert.assertTrue("File Uploaded",fileUploaded.isDisplayed());
        ReusableMethods.bekle(3);



    }
}
