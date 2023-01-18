package section12Udemy;

import static org.testng.AssertJUnit.assertEquals;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class Class102 {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","/home/vyrazu-66/Downloads/chromedriver_linux64 (2)/chromedriver");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    driver.manage().window().maximize();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    
	    js.executeScript("window.scrollBy(0,500)");
	    Thread.sleep(2000);
	    js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
	    
	    List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));

	    int sum = 0;
	    for(int i = 0 ; i<values.size() ; i++)
	    {
	    	sum = sum + Integer.parseInt(values.get(i).getText());
	    }
	    System.out.println(sum);
	
	  String actualvalue = driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim();
	  System.out.println(actualvalue);
	 //now converting string into integer value //
	  
	  int total = Integer.parseInt(actualvalue);
	 
	  assertEquals(sum, total);
	}
}
