package com;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hello {
	
	@Test(groups={"smoke"})
	public void test1(String b, String a) {
		System.out.println("test2");
		SoftAssert s=new SoftAssert();
		s.assertTrue(5>8);
		System.out.println("hi");
		s.assertAll();
		
	}

}
