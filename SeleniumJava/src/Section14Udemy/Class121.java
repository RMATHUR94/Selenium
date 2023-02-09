package Section14Udemy;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Class121 {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","/home/vyrazu-66/Downloads/chromedriver_linux64 (2)/chromedriver");

        WebDriver driver=new ChromeDriver();		
        
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().window().maximize();
        driver.findElement(By.id("search-field")).sendKeys("Rice");
        //1 result
        List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));
        //1 result
       List<WebElement> filteredList = veggies.stream().filter(veggi -> veggi.getText().contains("Rice")).collect(Collectors.toList());
       //compare between two
       Assert.assertEquals(veggies.size(), filteredList.size() );
        
        
	}

}
