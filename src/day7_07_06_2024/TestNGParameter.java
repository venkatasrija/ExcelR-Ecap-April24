package day7_07_06_2024;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameter {
	
	@Test
	@Parameters({"val1","val2"})
	public void sum(int a,int b) {
		 int sum =a+b;
		System.out.println("Addition is "+sum);
	}
}
