package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ThrowsKeywordHandling { // Checked Categories/CompileTime Exception
public static void main(String[]args) throws InterruptedException, IOException {
	Thread.sleep(1000); // checked exception java suggest to handle it before execution
	String excelPath = "";
	File file = new File(excelPath);
	FileInputStream fis = new FileInputStream(file); // java suggest to handle the exception
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet = wb.getSheetAt(0);
	String data = sheet.getRow(0).getCell(0).getStringCellValue();
	System.out.println(data);
}

}
