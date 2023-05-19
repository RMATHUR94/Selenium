import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.bidi.log.LogEntry;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;

public class ConsoleLogsCapture {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"/home/vyrazu-66/Downloads/chromedriver_linux64 (1)/chromedriver");
		        
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Browse Products")).click();
		driver.findElement(By.partialLinkText("Selenium")).click();
		driver.findElement(By.cssSelector(".add-to-cart")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".nav-link")).click();
		driver.findElement(By.id("exampleInputEmail1")).clear();
		driver.findElement(By.id("exampleInputEmail1")).sendKeys("2");
		
		LogEntries entry = driver.manage().logs().get(LogType.BROWSER); // get log entry object
		List<org.openqa.selenium.logging.LogEntry> logs = entry.getAll();//get all method retrun all logins in list
		
		for(org.openqa.selenium.logging.LogEntry e : logs)//iterator and getting each logs mesggages
		{
			System.out.println(e.getMessage());
		}
		
		
		

	}

}
