package day7_07_06_2024;

import org.testng.annotations.Test;

public class DepandsOnDemo {
	
	@Test(dependsOnMethods={"signUp"})
	public void login() {
		System.out.println("login method");
	}
	
	@Test
	public void signUp() {
		System.out.println("sign method");
	}

}
   