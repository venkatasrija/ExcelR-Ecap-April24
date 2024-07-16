package day8_10_06_2024;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel3 {

		public static void main(String[] args) throws Exception {
			String path ="C:\\Users\\User\\Desktop\\ECAP_Test_File.xlsx";
			FileInputStream fis= new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fis); 
			XSSFSheet sh=wb.getSheet("Data");
			int  rowCount=sh.getLastRowNum();
			
			//for getting all rows
			
			for(int i=0;i<=rowCount;i++) {
				 String username=sh.getRow(i).getCell(0).getStringCellValue();
				  String password=sh.getRow(i).getCell(1).getStringCellValue();
				  System.out.println(username+" "+password);
				  
		      }
				wb.close();
				fis.close();
					
			}

			}

