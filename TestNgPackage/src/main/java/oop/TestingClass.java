package oop;

import org.testng.annotations.Test;

public class TestingClass {
	// Day is a data type like int.
	// Primitive data type
	
	@Test
	public void test2() {
		Animal [] a=new Animal[2];
		a[0]=new Cow();
		a[1]=new Dog();
		for(int i=0;i<a.length;i++) {
			a[i].eat();
		}
		
		
		
		
//		Day D=Day.SATURDAY;
//		Day[] days=Day.values();
//		for(Day day:days) {
//			System.out.println(day);
//		}
	}
	


}
