package day8_10_06_2024;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

@SuppressWarnings("unused")
public class ReadExcel {
 
	/*1.declare file path
	 *2.declare workbook
	 *3.get sheet
	 *4.get row 
	 *5.get cell
	 **/
	public static void main(String[] args) throws Exception {
		String path ="C:\\Users\\User\\Desktop\\ECAP_Test_File.xlsx";
		FileInputStream fis= new FileInputStream(path);
		try (XSSFWorkbook wb = new XSSFWorkbook(fis)) {
			XSSFSheet sh=wb.getSheet("Data");
			
			XSSFRow row=sh.getRow(0);
			String un=row.getCell(0).getStringCellValue();
			String pass=row.getCell(1).getStringCellValue();
			System.out.println(un+"==>"+pass);
			
			XSSFRow row1=sh.getRow(1);
			String un1=row1.getCell(0).getStringCellValue();
			String pass1=row1.getCell(1).getStringCellValue();
			System.out.println(un1+"==>"+pass1);
			
			XSSFRow row2=sh.getRow(2);
			String un2=row2.getCell(0).getStringCellValue();
			String pass2=row2.getCell(1).getStringCellValue();
			System.out.println(un2+"==>"+pass2);
		}
		
	}

}
