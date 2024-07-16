package revision_26_06_2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		int rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		System.out.println("Total no of rows:"+rows);
		
		int columns=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th")).size();
		System.out.println("Total no of columns:"+columns);	
		
		for(int r=1;r<=rows;r++) {
			for(int c=2; c<=columns;c++) {
				String value= driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+r+"]//td["+c+"]")).getText();
				System.out.println(value);
				
			}
			
		}
		
				

	}
}
