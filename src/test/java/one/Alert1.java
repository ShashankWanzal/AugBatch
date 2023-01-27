package one;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1
{
   WebDriver driver;
   
   public Alert1() {
	   System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shash\\Downloads\\chromedriver_win32\\chromedriver.exe" );
   	driver=new ChromeDriver();
   }
   public void openpage() {
	  
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.get("http://demo.automationtesting.in/Alerts.html");
	   driver.getTitle();
   }
   public void click_on_alert() {
	   WebElement source = driver.findElement(By.xpath("//button[contains(text(),'click the button t')]"));
	   source.click();
	   Alert alt = driver.switchTo().alert();
	   System.out.println(alt.getText());
	   alt.dismiss();
   }
   public void closebrowser() {
	   driver.navigate().refresh();
	   driver.close();
   }
   
   
}
