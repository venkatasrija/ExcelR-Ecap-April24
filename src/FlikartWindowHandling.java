import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlikartWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement searchBtn= driver.findElement(By.name("q"));
		searchBtn.sendKeys("Saree");
		searchBtn.sendKeys(Keys.ENTER);
		List<WebElement> allSarees =driver.findElements(By.xpath("//div[@class='gqcSqV YGE0Z']/img"));
		System.out.print(allSarees.size());
		for(int i=1;i<=5;i++) {
			allSarees.get(i).click();
		}		
		String title = driver.getTitle();
		System.out.print(title);
		Set<String>allWindows= driver.getWindowHandles();
		@SuppressWarnings("rawtypes")
		Iterator itr = allWindows.iterator();
		while (itr.hasNext()) {
			String currentWindow =(String) itr.next();
			driver.switchTo().window(currentWindow);
			String currentTitle =driver.getTitle();
			System.out.println(currentTitle);
			
		}
		

		}
	}

