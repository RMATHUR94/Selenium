package section12Udemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass7 {

	public static void main(String[] args) 
	{
		// Number of rows present in the table.
		// Number of column present in the table.
        // data of second table in the row.
		System.setProperty("webdriver.chrome.driver","/home/vyrazu-66/Downloads/chromedriver_linux64 (2)/chromedriver");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    driver.manage().window().maximize();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		
	    List <WebElement> table = driver.findElements(By.xpath("//div[@class='left-align']//table[@id='product']"));
	   
	    
		
	}

}
