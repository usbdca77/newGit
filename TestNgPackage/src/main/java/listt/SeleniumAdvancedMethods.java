package listt;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class SeleniumAdvancedMethods {
 WebDriver dr;
 WebElement ele;
 List<WebElement> eles;
 Set<String> cwin;
 Options option;
 Navigation navigate;
 TargetLocator locate;
 Point point;
 Dimension dimention;
 Alert alert;
 
 public void test1() {
	 
	 // driver method
	 
	 dr.close();
	 ele=dr.findElement(By.id(""));
	 eles=dr.findElements(By.id(""));
	 dr.get("");
	 dr.getCurrentUrl();
	 String texts=dr.getPageSource();
	 dr.getTitle();
	 String pwin=dr.getWindowHandle();
	 cwin =dr.getWindowHandles();
	 option=dr.manage();
	 navigate=dr.navigate();
	 dr.quit();
	 locate=dr.switchTo();
	 
	 // webelement methods
	 
	 ele.click();
	 ele.clear();
	 ele.findElement(By.id(""));
	 ele.getCssValue("border");
	 ele.getAttribute("id");
	 point=ele.getLocation();
	 ele.getScreenshotAs(OutputType.FILE);
	 dimention=ele.getSize();
	 ele.getTagName();
	 ele.getText();
	 ele.isDisplayed();
	 ele.isEnabled();
	 ele.isSelected();
	 ele.submit();
	 ele.sendKeys("text");
	 
	 
	 //options methods
	 
	 option.getCookies();
	 option.deleteAllCookies();
	 option.timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 option.timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	 option.timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
	 option.window().maximize();
	 option.window().fullscreen();
	 
	 
	 // navigates methods
	 
	 //driver. get() is used to navigate particular URL(website) and wait till page
	 //load. ... navigate() is used to navigate to particular URL and does not wait to page load. 
	 //It maintains browser history or cookies to navigate back or forward.
	 
	 navigate.back();
	 navigate.forward();
	 navigate.refresh();
	 navigate.to("url"); // vs dr.get()
	 
	 
	// point methods
	 
	 point.getX();
	 point.getY();
	 
	 
	 // targetLocator
	 
	 alert=locate.alert();
	 alert.accept(); // click ok button
	 alert.dismiss();
	 alert.sendKeys("");
	 locate.defaultContent();
	 locate.frame(0);
	 locate.frame("");
	 locate.frame(ele);
	 locate.activeElement();
	 locate.parentFrame();
	 locate.window("");
	 
	 
	 // Dimention
	 
	 dimention.getHeight();
	 dimention.getWidth();
	 
	 
	 
 }
 
 public void actionMethods() {
	 
	 Actions a=new Actions(dr);
	 a.click();
	 a.clickAndHold(ele);
	 a.contextClick().build().perform(); // right click
	 a.doubleClick(ele);
	 a.dragAndDrop(ele, ele);
	 a.dragAndDropBy(ele, 10, 200);
	 a.keyDown(Keys.ARROW_DOWN);
	 a.moveToElement(ele);//hover over
	 a.pause(20);
	 a.release();
	 a.sendKeys("");
	 a.build().perform();
	 
	 // .build().perform() -- will use after all functions. 
 }
 
 
 public void selectMethods() {
	 
	 Select s=new Select(ele);
	 s.selectByIndex(0);
	 s.selectByValue("");
	 s.selectByVisibleText("");
	 s.getOptions().size();
	 s.getFirstSelectedOption();
	 s.deselectByValue("");
	 s.deselectAll();
	 s.deselectByIndex(8);
	 
	 
	// to handle window/desktop based application
	// need third party API like sikulli, AutoIT and Robot API
	 JavascriptExecutor js=(JavascriptExecutor)dr;
	 js.executeScript("window.scrollTo(0,1000)");
	 js.executeScript("document.getElementById('email').value=\"sdfgh\";");
	// js.executeScript("arguments[0].click()",)
	 
	 
 }
 
 public void screenShot() {
	 int i=(int)Math.random();
	 File f=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
	 try {
		Files.copy(f, new File("D:\\Selenium 2020\\TestNgPackage\\screenShoot"+i+".png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
 
 public void handleIframe(List<WebElement>frames, String attName, String attValue) {
	 for(WebElement frame:frames) {
		 String v=frame.getAttribute(attName);
		 if(v.equals(attValue)) {
			 dr.switchTo().frame(attValue);
			 //action
			 
		 }
		 
	 }
 }
	 
	 public void handleCookie(String cookieName) {
		 Set <Cookie> cookies=dr.manage().getCookies();
		 for(Cookie cookie:cookies) {
			 if(cookie.getName().equals(cookieName)) {
				 dr.manage().deleteCookieNamed(cookieName);
			 }
		 }
		 
	 }
 
 
 public void handleMultipleWin() {
	 Actions a =new Actions(dr);
	 String pwin=dr.getWindowHandle();
	 a.contextClick(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER);
	 Set<String> cwin=dr.getWindowHandles();
	 for(String win:cwin) {
		 if(!win.equals(pwin)) {
			 dr.switchTo().window(win);
		 }
		 
	 }
	 
	 
	 
 }
 
 
 
 
 
}
