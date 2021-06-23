package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ListPracticeTwo {
	
	WebDriver dr;
	@Test
	public void verifyMenuText() {
		
		// for attribute
		ArrayList<String> ac1=acValue(dr.findElements(By.xpath("xpath for menubar")), "id");
		String[]exv1= {"23456", "76857"};
		ArrayList<String> ex1=exValue(exv1);
		compare(ex1,ac1);
		
		// for text
		ArrayList<String> ac=acValue(dr.findElements(By.xpath("xpath for menubar")));
		String[]exv= {"Men", "Women" };
		ArrayList<String> ex=exValue(exv);
		compare(ex,ac);
	}
	public ArrayList<String> acValue(List<WebElement> elements) {
		ArrayList<String> ar=new ArrayList<String>(); // type safety
	//	ArrayList ar1=new ArrayList();  // generic
		for(WebElement element:elements) {
			String value=element.getText();
			ar.add(value);
	}
		return ar;
	}
	

	public ArrayList<String> acValue(List<WebElement> elements,String attName) {
		ArrayList<String> ar=new ArrayList<String>(elements.size()); // type safety
	//	ArrayList ar1=new ArrayList();  // generic
		for(WebElement element:elements) {
			String value=element.getAttribute(attName);
			ar.add(value);
	}
		return ar;
	}

	
	public ArrayList<String> exValue(String [] values) {
		ArrayList<String> ar=new ArrayList<String>(values.length); // type safety
	//	ArrayList ar1=new ArrayList();  // generic
		for(String value:values) {
			ar.add(value);
	}
		return ar;
	}
	
	public void compare(ArrayList<String> exValue, ArrayList<String> acValue) {
		Iterator<String> i=exValue.iterator();
		Iterator<String> i1=acValue.iterator();
		
		// .hasnext is question true/false? !
		
		while(i.hasNext()&&i1.hasNext()) {
			if(i.next().equals(i1.next())) {
				System.out.println("Matched");
				
			}
			else {
				System.out.println("Not Matched");
			}
		}
		
	}

	
	
}
