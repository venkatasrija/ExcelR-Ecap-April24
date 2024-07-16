package day7_07_06_2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class AssertionDemo {
    WebDriver driver;
   @Test
   public void login() throws InterruptedException {
	      driver =new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  Thread.sleep(2000);
		  driver.findElement(By.name("username")).sendKeys("Admin");
		  driver.findElement(By.name("password")).sendKeys("admin123");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  String expectedValue="Dashboard";
		  String actualValue=driver.findElement
				  (By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
				  
				  //   if(expectedValue.equals(actualValue)) {
				 // System.out.println("test case is passed");
				 //}
				 //else {
			     // System.out.println("test case fail");
				 // }
		  Assert.assertEquals(expectedValue, actualValue);
          }
	   }
   
