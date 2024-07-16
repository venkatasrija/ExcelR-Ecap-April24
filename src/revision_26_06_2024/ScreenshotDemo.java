package revision_26_06_2024;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		WebElement searchBtn= driver.findElement(By.name("q"));
		searchBtn.sendKeys("Saree");
		searchBtn.sendKeys(Keys.ENTER);
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File location=new File(".//Screenshot//saree.png");
		try {
			Files.copy(screenshot, location);
		} catch (IOException e) {

			e.printStackTrace();
		}
		
	}

}
