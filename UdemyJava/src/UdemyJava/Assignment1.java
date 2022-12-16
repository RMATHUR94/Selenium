package UdemyJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) 
	{
		  System.setProperty("webdriver.chrome.driver","/home/vyrazu-66/Downloads/chromedriver_linux64 (1)/chromedriver");
	       
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	       
	       System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());

	       driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
	      
	      System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
	      
	      System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

	}

}
