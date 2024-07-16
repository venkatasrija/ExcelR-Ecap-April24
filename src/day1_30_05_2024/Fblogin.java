package day1_30_05_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogin {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("abc@123");
		driver.findElement(By.name("login")).click();
	}

}
