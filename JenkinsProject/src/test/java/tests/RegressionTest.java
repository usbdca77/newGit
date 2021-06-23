package tests;

import org.testng.annotations.Test;

public class RegressionTest {
	
	@Test(groups="ui")
	public void test2() {
		System.out.println("Test Started");
	}
	
	
	@Test(groups="smoke")
	public void test3() {
		System.out.println("Test Started n");
	}
	

}
