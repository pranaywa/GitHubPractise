package testNGprac;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviderTestNG {

	@DataProvider(name = "ExcelData")
	public static String[][] excel() throws IOException {
		String excelPath = "C:\\Users\\Asus\\Desktop\\Excels\\testexcel.xlsx";
		File file = new File(excelPath);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		DataFormatter df = new DataFormatter();
		int rowCount = sheet1.getLastRowNum()+1;
		int colCount = sheet1.getRow(0).getLastCellNum();
		String data[][] = new String[rowCount][colCount];
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
			data[i][j] =df.formatCellValue(sheet1.getRow(i).getCell(j));
			}
		}
		return data;
		}
	
}
