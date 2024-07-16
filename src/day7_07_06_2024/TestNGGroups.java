package day7_07_06_2024;

import org.testng.annotations.Test;

public class TestNGGroups {
	@Test(groups = {"Smoke"})
	public void test() {
		System.out.println("test method");
	}
	
	@Test(groups = {"Sanity", "Smoke"})
	public void test1() {
		System.out.println("test1 method");
	}
   
	@Test(groups = {"regression"})
	public void test2() {
		System.out.println("test2 method");
	}

	
	@Test(groups = {"Smoke","retsting"})
	public void test3() {
		System.out.println("test3 method");
	}
	
	@Test(groups = {"Sanity"})
	public void test4() {
		System.out.println("test4 method");
	}


}
