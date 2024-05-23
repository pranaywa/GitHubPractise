package testNGprac;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviderClasss {

	@DataProvider(name = "DPClass")
	public static Object[][] readData() throws IOException{
     String excelPath = "C:\\Users\\Asus\\Desktop\\Excels\\DataProvider.xlsx";
     File file = new File(excelPath);
     FileInputStream fos = new FileInputStream(file);
     XSSFWorkbook wb = new XSSFWorkbook(fos);
     XSSFSheet sheet = wb.getSheetAt(0);
     int rowCount = sheet.getLastRowNum();
     int cellCount = sheet.getRow(0).getLastCellNum();
     Object [][] data = new Object[rowCount][cellCount];
     for(int i=0;i<=rowCount-1;i++) {
    	 for(int j=0;j<=cellCount-1;j++) {
    		  data[i][j]= sheet.getRow(i).getCell(j);
    	 }
     }
     return data;
     
	}
}
