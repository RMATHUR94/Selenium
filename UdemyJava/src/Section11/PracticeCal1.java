package Section11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeCal1 {

	public static void main(String[] args) throws Exception
	{
		    System.setProperty("webdriver.chrome.driver","/home/vyrazu-66/Downloads/chromedriver_linux64 (1)/chromedriver");
		    WebDriver driver = new ChromeDriver();  
		    driver.get("https://www.path2usa.com/travel-companions");
		    driver.manage().window().maximize();
		    //for scrolling
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,1100)");
		    
		    Thread.sleep(3000);
		    
		    WebElement Date = driver.findElement(By.xpath("//*[@id='form-field-travel_comp_date']"));
		    Date.click();
		    
		    while(!driver.findElement(By.xpath("//div[@class='flatpickr-next-month']")).getText().contains("April"))
		    { 
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();
		    }

	}

}
