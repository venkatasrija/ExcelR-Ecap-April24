package revision_25_06_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicCommands {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		
		
		driver.findElement(By.id("submit")).click();
		
		String expectedUrl="https://practicetestautomation.com/logged-in-successfully/";
		String actualUrl=driver.getCurrentUrl();
		if(actualUrl.contains(expectedUrl)) {
			System.out.println("url is right");
			
		}
		else {
			System.out.println("not right");
			
		}
		boolean logoutBtn=driver.findElement(By.linkText("Log out")).isDisplayed();
		if(logoutBtn==true) {
			System.out.println("Log out is displayed ");
		}
		else {
			System.out.println("Log out is not displayed ");
			
		}
		driver.close();
		
		}
}
