package section13Udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ManageWindows {

	public static void main(String[] args) 
	{
		//how to delete the cookies by using yours sel webDriver scripts.
		// delete session cookies and checks secure login and logout
		System.setProperty("webdriver.chrome.driver","/home/vyrazu-66/Downloads/chromedriver_linux64 (2)/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("SessionCookies"); // delete cookies by name
		//click on any link , you will redirected to login page
		driver.get("https://www.google.com/");
		ChromeOptions options = new ChromeOptions();
		

	}

}
