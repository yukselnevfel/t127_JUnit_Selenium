package tests.PRACTISE;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class P07 extends TestBase {

    //https://the-internet.herokuapp.com/upload adresine gidelim
    //Bilgisayarımızdaki herhangi bir dosyayı buraya yükleyelim
    @Test
    public void fileUpTest(){

        WebElement chooseFile=driver.findElement(By.id("file-upload"));
        chooseFile.click();

    }
}
