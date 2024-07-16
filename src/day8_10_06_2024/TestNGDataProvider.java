package day8_10_06_2024;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {
	
	@Test(dataProvider= "dataset")
	public void login(String un,String pass,int test) {
		System.out.println(un+"===>"+pass+"===>"+test);
		
	}
	
	@DataProvider(name="dataset")
	public Object[][] dpMethod()
	{
		return new Object[][]{
		{"username 1","password 1",1},
		{"username 2","password 2",2},
		{"username 3","password 3",3}
		
		  };
		
	}
}
	


