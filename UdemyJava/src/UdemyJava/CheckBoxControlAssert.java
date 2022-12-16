package UdemyJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxControlAssert {

	public static void main(String[] args)
	{

		  System.setProperty("webdriver.chrome.driver","/home/vyrazu-66/Downloads/chromedriver_linux64 (1)/chromedriver");
	       
	       WebDriver driver = new ChromeDriver();
	       
	       driver.get("https://book.spicejet.com/");
	       
	       driver.manage().window().maximize();
	       
	       
	       Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizen']")).isSelected());
	       //System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizen']")).isSelected());
	       
	       driver.findElement(By.cssSelector("input[id*='SeniorCitizen']")).click();
	       
	       Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizen']")).isSelected());
	       
	       System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
	}

}
