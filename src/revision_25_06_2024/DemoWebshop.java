package revision_25_06_2024;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebshop {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    List<WebElement> radios =driver.findElements(By.xpath("//input[@type='radio']"));
	    System.out.println(radios.size());
	    WebElement radio =driver.findElement(By.id("pollanswers-1"));
	    radio.click();
		if(radio.isSelected()==true) {
			System.out.println("radio is selected");
		
		}
		else {
		    System.out.println("not selected");
			}
		}
}
