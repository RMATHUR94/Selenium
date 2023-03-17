package section12Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass8 {

	public static void main(String[] args) throws Exception
	{
		// handeling auto-suggestive drop-down and fetching its value in the eclipse console.
		System.setProperty("webdriver.chrome.driver","/home/vyrazu-66/Downloads/chromedriver_linux64 (3)/chromedriver");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.id("autocomplete")).sendKeys("Ind");
	    Thread.sleep(2000);
	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	    System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
	}

}
