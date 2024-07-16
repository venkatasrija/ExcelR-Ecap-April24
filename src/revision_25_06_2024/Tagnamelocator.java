package revision_25_06_2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagnamelocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		List<WebElement>allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total no of links:"+allLinks.size());
		for(int i=0;i<allLinks.size();i++) {
			System.out.println(allLinks.get(i).getText());
			
		}
	

	}

}
