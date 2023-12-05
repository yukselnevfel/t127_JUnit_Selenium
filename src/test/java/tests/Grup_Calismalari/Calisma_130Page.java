package tests.Grup_Calismalari;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Calisma_130Page extends TestBase {

    @Test
    public void test130(){

        //Yeni bir class olusturalim: MouseActions2
        //1- https://demoqa.com/droppable adresine gidelim
        driver.get("https://demoqa.com/droppable");
        //2- “Drag me” butonunu tutup “Drop here” kutusunun ustune birakalim
        Actions actions=new Actions(driver);
        WebElement dragmeKutusu= driver.findElement(By.id("draggable"));
        System.out.println(dragmeKutusu.getText());
        WebElement drophereKutusu=driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
        System.out.println("Sürüklemeden önce:"+drophereKutusu.getText());
        actions.dragAndDrop(dragmeKutusu,drophereKutusu).perform();
        System.out.println("Sürüklemeden sonra:"+drophereKutusu.getText());
        //3- “Drop here” yazisi yerine “Dropped!” oldugunu test edin
        String drophereYaziElementi=drophereKutusu.getText();
        Assert.assertTrue(drophereYaziElementi.equals("Dropped!"));
    }
}
