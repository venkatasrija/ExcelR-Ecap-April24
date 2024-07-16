package day8_10_06_2024;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmloginExcel {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String path ="C:\\Users\\User\\Desktop\\ECAP_Test_File.xlsx";
		FileInputStream fis= new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis); 
		XSSFSheet sh=wb.getSheet("Sheet2");
		int  rowCount=sh.getLastRowNum();
		
		//for getting all rows
		
		for(int i=0;i<=rowCount;i++) {
			 String username=sh.getRow(i).getCell(0).getStringCellValue();
			  String password=sh.getRow(i).getCell(1).getStringCellValue();
			  System.out.println(username+" "+password);
			  driver.findElement(By.name("username")).sendKeys(username);
			  driver.findElement(By.name("password")).sendKeys(password);
			  driver.findElement(By.xpath("//button[@type='submit']")).click();
	      }
			wb.close();
			fis.close();
				
		}

		}

