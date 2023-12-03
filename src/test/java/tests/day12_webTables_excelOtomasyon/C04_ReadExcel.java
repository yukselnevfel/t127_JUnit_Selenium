package tests.day12_webTables_excelOtomasyon;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C04_ReadExcel {

    @Test
    public void readExcelTesti() throws IOException {

        String dosyaYolu="src/test/java/tests/day12_webTables_excelOtomasyon/ulkeler.xlsx";
        FileInputStream fileInputStream=new FileInputStream(dosyaYolu);
        Workbook workbook= WorkbookFactory.create(fileInputStream);
        Sheet sayfa2=workbook.getSheet("Sayfa2");

    }
}
