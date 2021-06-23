package baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOpen {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium 2020\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println("Success!");
		
		
		// TODO Auto-generated method stub

		
	//esire capabities of browser:  once we install it iwt will give us 11 instant browsers, then
	//e will create instantance of remote webdriver whice 
	//
		
		
	}

}
