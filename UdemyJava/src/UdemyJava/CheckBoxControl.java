package UdemyJava;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBoxControl {
    
	
	public static void main(String[] args) throws Exception
	{
      
		  System.setProperty("webdriver.chrome.driver","/home/vyrazu-66/Downloads/chromedriver_linux64 (1)/chromedriver");
	       
	       WebDriver driver = new ChromeDriver();
	       
	       driver.get("https://book.spicejet.com/");
	       
	       driver.manage().window().maximize();
	       
	       
	       System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizen']")).isSelected());
	       
	       driver.findElement(By.cssSelector("input[id*='SeniorCitizen']")).click();
	       
	       System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizen']")).isSelected());
	       
	       System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}
