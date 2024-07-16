package revision_25_06_2024;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiosDemo {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/radio-button");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	List<WebElement> radios =driver.findElements(By.xpath("//input[@type='radio']"));
	System.out.println(radios.size());
	for(int i=0;i<radios.size();i++) {
		radios.get(i).getText();
		System.out.println(radios.get(i).getText());
	
		
	}
	//WebElement radioBtn=driver.findElement(By.id("YesRadio"));
	//radioBtn.click();
	//if(radioBtn.isSelected()==true) {
	
	}
	//else {
	//	System.out.println("not selected");
		
	//}
	//}
}
	
