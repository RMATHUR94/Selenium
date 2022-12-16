package Ex1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Ex1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "/home/vyrazu-66/Downloads/geckodriver-v0.31.0-linux64/");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
	}

}
