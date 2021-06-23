package com;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import javax.xml.datatype.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SmokeTest {
	
	WebDriver dr= new ChromeDriver();



	@Test(groups="ui")
	public void test1(String b, String a) {
		System.out.println();
	}
	
	public void waitForEle() {
		Wait<WebDriver> wait=new FluentWait<WebDriver>(dr);
				  .withTimeout(30,TimeUnit.SECONDS)
				  .pollingEvery(5, TimeUnit.SECONDS)
				  .ignoring(NoSuchElementException.class);

				WebElement foo = wait.until(new Function<WebDriver, WebElement>() 
				{
				  public WebElement apply(WebDriver driver) {
				    return driver.findElement(By.id("foo"));
				  }
				});
				  
	}
	
	public void waitForElement() {
		WebDriverWait wait=new WebDriverWait(dr, 10);
		wait.until(ExpectedConditions.visibilityOf(ele));
		return ele;
		
	}
	
}
