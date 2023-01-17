package section12Udemy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
	}

}
