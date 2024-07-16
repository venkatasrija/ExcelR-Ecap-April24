package day9_11_06_2024;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelUtility {
	// with readData method we fetch data from any file and any sheet
	
	public Object[][] readData(String filepath,String sheetname)throws Exception {
		XSSFWorkbook wb = new XSSFWorkbook(filepath); 
		XSSFSheet sheet=wb.getSheet(sheetname);
		int  rowCount=sheet.getPhysicalNumberOfRows();
		int  cellCount=sheet.getRow(0).getLastCellNum();
		
		Object[][]data=new Object[rowCount][cellCount];
		for(int row=0;row<rowCount;row++) {
			for(int cell=0;cell<cellCount;cell++) {
				data[row][cell]=sheet.getRow(row).getCell(cell);
			}
			
			
		}
		wb.close();
		return data;
	}
		
}
