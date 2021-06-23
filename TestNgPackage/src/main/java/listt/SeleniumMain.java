package listt;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SeleniumMain {

		    //FirefoxDriver dr=new FirefoxDriver();
		    @Test
		    public void screenShot() throws IOException
		    {
		        dr.get("http://www.eshopper24.com");
		        dr.manage().window().maximize();
		        File sf=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		        FileUtils.copyFile(sf, new File("C:/Users/bittech/Desktop/shot"+Math.random()*1000+".png"),true);
		        //File f=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		        /*FileUtils.copyFile(f, new File("C:\\Users\\bittech\\Desktop\\screen\\shot1.png"), true);
		        */
		        
		        
		    }
		    @Test
		    public void rightmouseclick() throws InterruptedException
		    {
		        FirefoxDriver dr=new FirefoxDriver();
		        dr.get("http://www.eshopper24.com");
		        dr.manage().window().maximize();
		        WebElement ele=dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]/a"));
		        Actions ac=new Actions(dr);
		        ac.contextClick(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
		        .sendKeys(Keys.ENTER).perform();
		        Thread.sleep(3000);

		    }
		    @Test
		    public void controlKeyboard()
		    {
		        FirefoxDriver dr=new FirefoxDriver();
		        dr.get("http://www.eshopper24.com");
		        dr.manage().window().maximize();
		        Keyboard kb=((HasInputDevices)dr).getKeyboard();
		        kb.sendKeys(Keys.chord(Keys.CONTROL,Keys.ALT,"p"));
		        kb.sendKeys(Keys.F5);
		    }
		    
		    @Test
		    public void drugable() throws Throwable
		    {
		        FirefoxDriver dr=new FirefoxDriver();
		        dr.get("http://www.jqueryui.com/droppable/");
		        dr.switchTo().frame(0);
		        WebElement dropable=dr.findElement(By.id("draggable"));//source file
		        WebElement moga2=dr.findElement(By.id("droppable"));//target file
		        new Actions(dr).dragAndDropBy(dropable, 200, 10).build().perform();//this for anywhere based on pixel
		        new Actions(dr).dragAndDrop(dropable, moga2).build().perform();//this for specific place
		        Thread.sleep(4000);
		    }
		    @Test
		    public void scrollDown() throws InterruptedException
		    {
		        FirefoxDriver dr=new FirefoxDriver();
		        dr.get("http://www.eshopper24.com");
		        dr.manage().window().maximize();
		        dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		        WebElement ele=dr.findElement(By.xpath("html/body/div[4]/div[2]/div/section/div[16]/figure/a/img"));
		        Coordinates co=((Locatable)ele).getCoordinates();
		        co.inViewPort();
		        Thread.sleep(3000);
		    }
		    
		    @Test
		    public void windowh() throws InterruptedException
		    {
		        FirefoxDriver dr=new FirefoxDriver();
		        dr.get("http://www.eshopper24.com");
		        dr.manage().window().maximize();
		        dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		        WebElement ele=dr.findElement(By.xpath("html/body/div[4]/div[2]/div/section/div[5]/figure/a/img"));
		         //for scrool down
		        Coordinates co=((Locatable)ele).getCoordinates();
		        co.inViewPort();
		        Thread.sleep(5000);
		        //dr.findElement(By.xpath("html/body/div[4]/div[2]/div/section/div[5]/figure/a/img")).click();*/
		        //for right click
		        Actions ac=new Actions(dr);
		        ac.contextClick(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		        
		        //multiple window handle
		        String win=dr.getWindowHandle();
		        Set<String> cwin=dr.getWindowHandles();
		        System.out.println(cwin.size());
		        //String handle=driver.getWindowHandle();
		        //all window handle
		        //Set<String> handles=driver.getWindowHandles();
		        //loop for each handle
		        for(String h:cwin)
		        {
		            if(!h.equals(cwin))
		            {
		                Thread.sleep(3000);
		                dr.switchTo().window(h);
		                Thread.sleep(3000);
		                dr.findElement(By.xpath(".//*[@id='ui-id-1']")).click();
		                System.out.println("clicked");
		            }
		        }    
		        }
		    @Test
		    public void alerthandle() throws InterruptedException
		    {
		        FirefoxDriver dr=new FirefoxDriver();
		        dr.get("http://localhost/alert.html");
		        dr.manage().window().maximize();
		        dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		        dr.findElement(By.xpath("//input[@value='login']")).click();
		        Thread.sleep(2000);
		        dr.switchTo().alert().accept();
		        dr.findElement(By.xpath("//input[@value='login1']")).click();
		        Thread.sleep(2000);
		        dr.switchTo().alert().dismiss();
		        dr.findElement(By.xpath("//input[@value='login2']")).click();
		        Thread.sleep(2000);
		        
		        Alert a=dr.switchTo().alert();
		        if(a.getText().contains("hi,this is prompt box"))
		                {
		            System.out.println("true");
		                }
		        else
		            System.out.println("false");
		        a.sendKeys("hgfh");
		        Thread.sleep(2000);
		        a.accept();
		        
		    }
		    @Test
		    public void drop() throws InterruptedException
		    {
		        FirefoxDriver dr=new FirefoxDriver();
		        dr.get("http://jqueryui.com/droppable/");
		        dr.manage().window().maximize();
		        dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		        dr.switchTo().frame(0);
		        String s=dr.findElement(By.xpath(".//*[@id='draggable']")).getText();
		        System.out.println(s);
		        dr.switchTo().defaultContent();
		        dr.findElement(By.xpath(".//*[@id='sidebar']/aside[1]/ul/li[2]/a")).click();
		}
		    @Test
		    public void ajax()
		    {
		        FirefoxDriver dr=new FirefoxDriver();
		        dr.get("https://www.eshopper24.com/");
		        dr.manage().window().maximize();
		        dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		        WebDriverWait w=new WebDriverWait(dr, 20);
		        w.until(ExpectedConditions.elementToBeClickable(dr.findElement
		                (By.cssSelector(".button_type_4.bg_scheme_color.color_light.r_corners.tt_uppercase")))).click();
		        
		    }
		    @Test
		    public void textAttribute()
		    {
		        FirefoxDriver dr=new FirefoxDriver();
		        dr.get("http://www.facebook.com");
		        String s=dr.findElement(By.xpath("")).getAttribute("id");
		        dr.findElement(By.xpath("")).click();
		        String s1=dr.findElement(By.xpath("")).getAttribute("id");
		        if(s.equals(s1))
		        {
		            
		        }
		        else
		            System.out.println("");
		            dr.findElement(By.xpath("")).getText();
		            
		    }
		    @Test
		    public void dropdownmenu()
		    {
		        FirefoxDriver dr=new FirefoxDriver();
		        dr.get("http:www.facebook.com");
		        dr.manage().window().maximize();
		        dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		        Select s=new Select(dr.findElement(By.id("month")));
		        //s.selectByVisibleText("Jan");
		        int size=s.getOptions().size();
		        Select si=new Select(dr.findElement(By.id("year")));
		        int s1=s.getOptions().size();
		        System.out.println(size);
		        for(int i=size-1;i>=0;i--)
		        {
		        s.selectByIndex(i);
		        for(int j=0;j<5;j++)
		        {
		            si.selectByIndex(j);
		        }
		        }
		    }
		    
		    @Test
		    public void getAllLink()
		    {
		        FirefoxDriver dr=new FirefoxDriver();
		        dr.get("http://www.facebook.com");
		        dr.manage().window().maximize();
		        dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		        List<WebElement> s=dr.findElements(By.tagName("a"));
		        String s1=dr.findElement(By.xpath(".//*[@id='pageFooter']/div[2]/table/tbody/tr[1]/td[2]/a")).getText();
		        System.out.println(s);
		        System.out.println(s1);
		        //for attribut
		        String s2=dr.findElement(By.xpath(".//*[@id='u_0_i']")).getAttribute("id");
		        System.out.println(s2);
		        
		        for(WebElement moga:s)
		        {
		          System.out.println(moga.getText());
		        }
		        
		        
		    }
		    @Test
		    public void hoverOver()
		    {
		        FirefoxDriver dr=new FirefoxDriver();
		        dr.get("http://www.bluefly.com");
		        dr.navigate().refresh();
		        Actions ac=new Actions(dr);
		        WebElement ele=dr.findElement(By.xpath(".//*[@id='main-nav-woman']/a"));
		        ac.moveToElement(ele).perform();
		    }
		    @Test
		    public  void m() throws IOException
		    {
		    
		        FirefoxProfile fp=new FirefoxProfile();
		        File f=new File("C:\\Users\\bittech\\Downloads\\firebug-2.0.1.xpi");
		        File f1=new File("C:\\Users\\bittech\\Downloads\\firepath-0.9.7-fx.xpi");
		        FirefoxBinary fbinary=new FirefoxBinary(new File("C:\\Users\\bittech\\Downloads\\Firefox Setup 36.0.exe"));
		        fp.addExtension(f);
		        fp.addExtension(f1);
		        FirefoxDriver dr=new FirefoxDriver(fbinary,fp);
		        dr.get("http://www.facebook.com");
		    }
		    
		    @Test
		    public void callmethod()
		    {
		        ajax1(dr.findElement(By.xpath("")));
		        click(By.xpath(""));
		        type(By.xpath(""),"hsdgf");
		        click(By.xpath(""));
		        isElementPresent(dr.findElement(By.xpath("")));
		        textPresent();
		        verifyTitle();
		        verfiyTitle("");
		    }
		    FirefoxDriver firefox = new FirefoxDriver();
		    void type(By x, String s)
		    {
		        firefox.findElement(x).sendKeys(s);
		    }
		    void click(By x)
		    {
		        firefox.findElement(x).click();
		    }
		    void isElementPresent(WebElement ele)
		    {
		        if(ele.isDisplayed())
		        {
		            System.out.println("present");
		        }
		        System.out.println("not present");
		    }
		    FirefoxDriver dr=new FirefoxDriver();
		    void textPresent()
		    {
		        dr.get("http://www.facebook.com");
		        System.out.println(dr.getPageSource().contains("shahidul"));
		    }
		    void verifyTitle()
		    {
		        dr.get("http://www.facebook.com");
		        System.out.println(dr.getTitle().contains("Facebook"));
		    }
		    void verfiyTitle(String x)
		    {
		        System.out.println(dr.getTitle().contains(x));
		    }
		    
		    void verifyUrl(String x)
		    {
		        dr.get("http://www.facebook.com");
		        System.out.println(dr.getCurrentUrl().equals(x));
		    }
		    
		    @Test
		    public void m1()
		    {
		        WebDriver dr;

		        String s=System.getProperty("browser");
		                if(s.equals("f"))
		                {
		                 dr=new FirefoxDriver();
		                }
		                else if(s.equals("c"))
		                {
		                  System.setProperty("webdriver.chrome.driver", "C:/driver/chromedriver.exe");
		                   dr=new ChromeDriver();
		                }
		                else if(s.equals("ie"))
		                {
		                  System.setProperty("webdriver.ie.driver", "C:/driver/IEDriverServer.exe");
		                  dr=new InternetExplorerDriver();
		                }
		                else
		                    dr=new FirefoxDriver();
		    }
		    public WebElement ajax1(WebElement ele)
		    {
		        
		        WebDriverWait w=new WebDriverWait(dr, 20);
		        return w.until(ExpectedConditions.elementToBeClickable(ele));
		        
		    }
		        
		    
		    @Test
		    public void addCookie()
		    {
		        FirefoxDriver driver= new FirefoxDriver();
		        String URL="http://flipkart.com/";
		        driver.navigate().to(URL);
		                //we should pass name and value for cookie as parameters
		                // In this example we are passing, name=mycookie and value=123456789123
		        Cookie name = new Cookie("mycookie", "123456789123");
		        driver.manage().addCookie(name);
		        
		                // After adding the cookie we will check that by displaying all the cookies.
		        Set<Cookie> cookiesList =  driver.manage().getCookies();
		        for(Cookie getcookies :cookiesList) {
		            System.out.println(getcookies );
		        }
		        driver.manage().deleteCookieNamed("__utmb");//delete with cookie name
		        driver.manage().deleteAllCookies();//delete all cokie
		        driver.manage().getCookies();//get cookie
		         driver.manage().getCookieNamed("name");
		    }
		
	

}
