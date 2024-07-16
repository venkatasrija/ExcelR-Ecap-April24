package day1_30_05_2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws Exception {
		
		//WebDriver driver =new ChromeDriver();
		
		WebDriver driver =new EdgeDriver();

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	
	}

}
