package day6_06_06_2024;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNg5 {
	/*@BeforeSuite
	//*@Test
	//*@Test
	//*@AfterSuite
	**/
    @Test
    public void enterUrl() {
 	  System.out.println("Test case 1");
 	  
	}
 	  
 	 @BeforeSuite
     public void openBrowser() {
  	  System.out.println("Browser is opend");
  	  
 	 }
 	 @AfterSuite
     public void closeBrowser() {
  	  System.out.println("Browser is closed");
  	  
    }
 	 @Test
     public void enterUrl2() {
  	  System.out.println("Test case 2");
   }
}
