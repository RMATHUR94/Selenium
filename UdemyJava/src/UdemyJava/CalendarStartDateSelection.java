package UdemyJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarStartDateSelection {

	public static void main(String[] args) throws	Exception
	{
	    
		   System.setProperty("webdriver.chrome.driver","/home/vyrazu-66/Downloads/chromedriver_linux64 (1)/chromedriver");
	        
	        WebDriver driver = new ChromeDriver();
	        
	        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	        driver.manage().window().maximize();
	        
	        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
	        Thread.sleep(2000);		
	     
	        
	        driver.findElement(By.xpath("//a[@value='AMD']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("(//a[@value='CCU'])[2]")).click();
	        Thread.sleep(2000);

	        driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight']")).click();
	}

}
