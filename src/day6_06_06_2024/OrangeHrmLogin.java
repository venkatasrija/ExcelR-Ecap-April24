package day6_06_06_2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OrangeHrmLogin {
	WebDriver driver;
	@BeforeSuite
	 public void openBrowser() {
      driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
   }
	@AfterSuite
	 public void closeBrowser() throws InterruptedException {
	   Thread.sleep(5000);
		driver.close();
	}
	@Test(priority=1)
	public void enterUrl() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	}
	@Test(priority =2)
	public void login() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	@Test(priority =3)
	public void logout() throws InterruptedException {
		driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		
	}
}
