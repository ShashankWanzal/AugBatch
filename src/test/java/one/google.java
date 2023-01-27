package one;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class google {
	
	WebDriver driver;
	
	public google() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shash\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		driver=new ChromeDriver();
	}
	public void loadurl() throws InterruptedException
	{
		
	driver.get("http://demo.automationtesting.in/Register.html");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.manage().window().maximize();
	//Thread.sleep(2000);
	//System.out.println(driver.getPageSource());
	//driver.close();
	

	}
	
	public void search()
	{
		//driver.findElement(By.id("input")).sendKeys("http://demo.automationtesting.in/Register.html");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Shashank");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Wanzal");
		driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")).sendKeys("banjara colony pusad");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("shashankwanzal12@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9588676848");
		driver.findElement(By.xpath("(//div[@class='col-md-4 col-xs-4 col-sm-4'])[5]//input")).click();
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'English')]")).click();
		WebElement chek1 = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select s1=new Select(chek1);
		s1.selectByVisibleText("Java");
		WebElement chek2 = driver.findElement(By.xpath("//select[@id='countries']"));
		Select s2=new Select(chek2);
		s2.selectByVisibleText("India");
		//driver.findElement(By.xpath("//input[@class='select2-search__field']")).click();
		//driver.findElement(By.xpath("//li[contains(text(),'India')]")).click();
		WebElement year = driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select s3=new Select(year);
		s3.selectByVisibleText("1994");
		WebElement month = driver.findElement(By.xpath("(//select[@type='text'])[4]"));
		Select s4=new Select(month);
		s4.selectByVisibleText("October");
		WebElement day = driver.findElement(By.xpath("(//select[@type='text'])[5]"));
		Select s5=new Select(day);
		s5.selectByVisibleText("25");
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("123@123");
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("123@123");
		
	    }
		
	
}
