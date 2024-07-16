package revision_26_06_2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);

		WebElement fashion=driver.findElement(By.xpath("//div[@aria-label='Fashion']"));
		WebElement electronics =driver.findElement(By.xpath("//div[@aria-label='Electronics']"));
		Actions act=new Actions(driver);
		act.moveToElement(fashion).build().perform();
		act.moveToElement(electronics).build().perform();
		
	WebElement searchBtn= driver.findElement(By.name("q"));
	searchBtn.sendKeys("Saree");
	act.doubleClick(searchBtn).build().perform();
	act.contextClick(searchBtn).build().perform();
	}
}