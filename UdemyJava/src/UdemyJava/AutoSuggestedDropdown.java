package UdemyJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestedDropdown {

	public static void main(String[] args) throws Exception
	{

	       System.setProperty("webdriver.chrome.driver","/home/vyrazu-66/Downloads/chromedriver_linux64 (1)/chromedriver");
	       
	       WebDriver driver = new ChromeDriver();
	       
	       driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	       
	       driver.manage().window().maximize();
           
	       driver.findElement(By.id("autosuggest")).sendKeys("chi");
	       
	       Thread.sleep(2000);
	       List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	       
	       for(WebElement option : options)
	       {
	    	   if(option.getText().equalsIgnoreCase("China"))
	    	   {
                 option.click();
                 break;
	    	   }
	       }
	}

}
