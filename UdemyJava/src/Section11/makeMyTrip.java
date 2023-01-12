package Section11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class makeMyTrip {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","/home/vyrazu-66/Downloads/chromedriver_linux64 (2)/chromedriver");
		    WebDriver driver = new ChromeDriver();  
		    driver.get("https://www.makemytrip.com/");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    WebElement popup = driver.findElement(By.cssSelector(".autopop__wrap.autopop__wrap__new.makeFlex.column.defaultCursor"));
		    WebElement login = driver.findElement(By.xpath("//li[@data-cy='account']"));
		    if(popup.isDisplayed())
		    {
		    	login.click();
		    }
		    
		    
	}

}
