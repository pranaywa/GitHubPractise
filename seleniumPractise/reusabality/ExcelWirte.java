package reusabality;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWirte {
public void excelW(int i, int j,String data) throws IOException {
	String excelPath = "C:\\Users\\Asus\\Desktop\\Excels\\new webtable.xlsx";
	File file = new File(excelPath);
	FileInputStream fis = new FileInputStream(file);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	File fout = new File(excelPath);
	FileOutputStream fos = new FileOutputStream(fout);
	sheet1.createRow(i).createCell(j).setCellValue(data);
	wb.write(fos);
	
}
public static void main(String[] args) throws IOException {
	ExcelWirte w = new ExcelWirte();
	w.excelW(0, 0,"Testing");
}
}
