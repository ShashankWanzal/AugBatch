package one;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntra2 
{
WebDriver driver;
String exp="Calvin Klein(123)";
	
    public myntra2 () 
    {
    	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shash\\Downloads\\chromedriver_win32\\chromedriver.exe" );
    	driver=new ChromeDriver();
    }
    
    public void go_to_myntra_Bags() {
    	
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.get("https://www.myntra.com/men-bags-backpacks");     
    }
    
   public void find_laptop_bag() {
	   
	   List<WebElement> bag = driver.findElements(By.xpath("//div[@class='vertical-filters-filters brand-container']//ul//li"));
	
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
