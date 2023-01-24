package section13Udemy;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sslCertificationCheckout {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/home/vyrazu-66/Downloads/chromedriver_linux64 (2)/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
	    WebDriver driver = new ChromeDriver(options);
	    driver.get("https://expired.badssl.com/");
	    driver.manage().window().maximize();
	    
	    driver.manage().deleteAllCookies();
	    
	    driver.get("https://www.google.com/");
	    
	   //File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   //FileUtils.copyFile(src,new File("/home/vyrazu-66/Pictures/ss1.png"));

	}

}
