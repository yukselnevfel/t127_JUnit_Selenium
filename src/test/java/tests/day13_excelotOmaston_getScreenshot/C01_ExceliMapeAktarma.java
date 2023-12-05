package tests.day13_excelotOmaston_getScreenshot;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_ExceliMapeAktarma {
    @Test
    public void readExcelTesti() throws FileNotFoundException {
        // Ulkeler excel'indeki Turkce ulke isimleri ve
        // Turkce baskent isimlerini bir Map olarak kaydedin

        // Rusya'nin baskentinin Moskova oldugunu test edelim

        // Listede baskenti San Marino olan bir ulke oldugunu test edelim


        // Listede Filipinler'in oldugunu test edelim

        String dosyaYolu="src/test/java/tests/day12_webTables_excelOtomasyon/ulkeler.xlsx";
        FileInputStream fis= new FileInputStream(dosyaYolu);


    }
}
