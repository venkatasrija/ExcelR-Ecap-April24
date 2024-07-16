package day8_10_06_2024;

import java.io.FileInputStream;



import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {

	public static void main(String[] args) throws Exception {
		String path ="C:\\Users\\User\\Desktop\\ECAP_Test_File.xlsx";
		FileInputStream fis= new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis); 
		XSSFSheet sh=wb.getSheet("Data");
		int  rowCount=sh.getLastRowNum();
		
		//for getting all rows
		
		for(int i=0;i<=rowCount;i++) {
			int cellCount=sh.getRow(i).getLastCellNum();
			System.out.println("Row"+i+"data is:");	      
			//for getting all cells
			for(int j=0;j<cellCount;j++) {
				System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
			}
			
		}
		wb.close();
		fis.close();
	}
}

