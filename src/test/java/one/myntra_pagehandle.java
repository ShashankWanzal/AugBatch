package one;

import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class myntra_pagehandle {
	
	WebDriver driver;
	
    public myntra_pagehandle() 
    {
    	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shash\\Downloads\\chromedriver_win32\\chromedriver.exe" );
    	driver=new ChromeDriver();
    }
    
    public void go_to_myntra() {
    	
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.get("https://www.myntra.com/");
        
        
    }
    public void click_on_men() 
    {
    	
    	WebElement men = driver.findElement(By.xpath("//a[@class='desktop-main']"));
    	men.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
     
    }
    public void click_on_women() 
    {
    	
    	WebElement men = driver.findElement(By.xpath("(//a[@class='desktop-main'])[2]"));
    	men.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
     
    }
    public void click_on_kid() 
    {
    	
    	WebElement men = driver.findElement(By.xpath("(//a[@class='desktop-main'])[3]"));
    	men.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
     
    }
    public void click_on_home() 
    {
    	
    	WebElement men = driver.findElement(By.xpath("(//a[@class='desktop-main'])[4]"));
    	men.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
     
    }
    public void click_on_beauty() 
    {
    	
    	WebElement men = driver.findElement(By.xpath("(//a[@class='desktop-main'])[5]"));
    	men.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
     
    }
    
    public void windowhandles() 
    {
    ArrayList al=new ArrayList(driver.getWindowHandles());
    
    for(int i=0;i<=al.size()-1;i++) 
    {
     driver.switchTo().window((String) al.get(i));
     System.out.println(driver.getTitle());
	
    } 
    }
 
    public void close() {
    	driver.quit();
    }
    
    
    
    
//    public void goforward_Backward()
//    {
//    	System.out.println(driver.getTitle());
//        driver.navigate().back();
//        System.out.println(driver.getTitle());
//    	driver.navigate().forward();
//    	driver.navigate().refresh();
//    	driver.close();	
//    }
//    
//    
    
    
    
}
