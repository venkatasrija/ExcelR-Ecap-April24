package day1_30_05_2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrl {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String expectedTitle ="Facebook – log in or sign up";
		String actualTitle   = driver.getTitle();
		System.out.println("Title of Webpage:"+ actualTitle);
		
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Test Case is pass");
		}
		else {
			System.out.println("Fail");
			
		}
		String currentUrl =driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.close();
		
	}
	
}