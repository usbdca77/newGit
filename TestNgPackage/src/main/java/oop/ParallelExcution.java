package oop;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ParallelExcution {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
	
		 //FirefoxDriver driver = new FirefoxDriver();
		         
		        DesiredCapabilities capability = DesiredCapabilities.firefox();
		        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
		        driver.get("http://www.facebook.com");
		    }
		}

