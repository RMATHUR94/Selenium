package Section11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarDateSelection {

	public static void main(String[] args) 
	{
		    System.setProperty("webdriver.chrome.driver","/home/vyrazu-66/Downloads/chromedriver_linux64 (1)/chromedriver");
		    WebDriver driver = new ChromeDriver();
	        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	        driver.manage().window().maximize();
	        driver.get("https://www.path2usa.com/travel-companion/");
	        driver.findElement(By.xpath(".//*[@id='travel_date']")).click();
	        
	        
	}

}
