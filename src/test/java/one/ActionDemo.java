package one;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo
{

	WebDriver driver;
	Actions act;
	String exp="Trolley Bag(830)";
	ChromeOptions opt;
	
    public ActionDemo() 
    {
    	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shash\\Downloads\\chromedriver_win32\\chromedriver.exe" );
    	opt=new ChromeOptions();
    	//opt.addArguments("--disable-notifications","--start-maximized");
    	HashMap prefs=new HashMap<String, String>();
    	prefs.put("profile.default_content_setting_values.notifications", 1);
    	driver=new ChromeDriver(opt);
    	act=new Actions(driver);
    }
    
    public void go_to_myntra() {
    	
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.get("https://www.myntra.com/");
    	
    }
    public void get_tittle() {
    	
    	
    	System.out.println(driver.getTitle());
    	
    }
    	
    
    
    public void click_on_Men() {
    	WebElement men = driver.findElement(By.xpath("//a[@class='desktop-main']"));
    	act.moveToElement(men).perform();
    	
    	WebElement bag = driver.findElement(By.xpath("//a[text()='Bags & Backpacks']"));
    	
    	act.moveToElement(bag).click().perform();
    }
    
    public void find_Trolly_bag() {
 	   
 	   List<WebElement> bag = driver.findElements(By.xpath("//div[@class='vertical-filters-filters categories-container']//ul/li"));
 	
 	   for(WebElement laptopbag:bag) 
 	   {
 		String act = laptopbag.getText();
 		
 		if(exp.equals(act)) {
 						
 			System.out.println("it is matching");
 			laptopbag.click();
 			
 		}
    
 	   }
 	   }
    
    public void close_browser() throws InterruptedException {
 	   Thread.sleep(2000);
 	   driver.close();
      }
     
	
}
