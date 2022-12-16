import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction   {

	public static void main(String[] args) 
	{
		//Invoiking Browser
		//Chrome -ChromeDriver -> all method contains
		//WebDriver methods + class methods = ChromeDriver()
		
		//ChromeDriver driver = new ChromeDriver();
		// chromedriver.exe --> Chrome browser
		System.setProperty("webdriver.chrome.driver","/home/vyrazu-66/Downloads/chromedriver_linux64 (1)/chromedriver");
		//webdriver.chrome.driver --> value of path
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/software-developer-engineer-test-sdet.html#2");
		
		System.out.println(driver.getCurrentUrl());
		driver.getTitle();		
		
	}

}
