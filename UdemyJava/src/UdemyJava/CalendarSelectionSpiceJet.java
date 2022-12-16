package UdemyJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalendarSelectionSpiceJet {

	public static void main(String[] args)
	{

		    System.setProperty("webdriver.chrome.driver","/home/vyrazu-66/Downloads/chromedriver_linux64 (1)/chromedriver");
	        
	        WebDriver driver = new ChromeDriver();
	        
	        driver.get("https://book.spicejet.com/");
	        driver.manage().window().maximize();
	        
	        System.out.println(driver.findElement(By.name("custom_date_picker")).isEnabled());  // retrun will false
	        
	        System.out.println(driver.findElement(By.id("marketDate_2")).getAttribute("style")); // attribute value before click
	        
	        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip")).click();
	        
	        System.out.println(driver.findElement(By.id("marketDate_2")).getAttribute("style")); // attribute value after click

	        System.out.println(driver.findElement(By.name("custom_date_picker")).isEnabled());  // retrun will True
	        
	        
	        System.out.println(driver.findElement(By.id("marketDate_2")).getAttribute("style"));
	        
	        
	        if(driver.findElement(By.id("marketDate_2")).getAttribute("style").contains("1"))
	        {
	        	
	        	System.out.println("IS ENABLED");
	        	
	        	Assert.assertTrue(true);
	        	
	        }
	        else
	        {
	        	Assert.assertTrue(false);
	        }

	}

}
