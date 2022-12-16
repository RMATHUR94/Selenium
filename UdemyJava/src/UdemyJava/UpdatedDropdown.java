package UdemyJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws Exception
	{
       System.setProperty("webdriver.chrome.driver","/home/vyrazu-66/Downloads/chromedriver_linux64 (1)/chromedriver");
       
       WebDriver driver = new ChromeDriver();
       
       driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
       driver.manage().window().maximize();
       
       Thread.sleep(1000);
       
       driver.findElement(By.id("divpaxinfo")).click();
       Thread.sleep(2000);
       
       System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
       
       for(int i =1 ; i<5 ; i++)
       {
    	   driver.findElement(By.id("hrefIncAdt")).click();
          
    	   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
    	   //Assert.assertEquals("System.out.println(driver.findElement(By.id(\"divpaxinfo\")).getText())","5 Adults");
           
       }
       driver.findElement(By.id("btnclosepaxoption")).click();
       System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
       
       
	}

}
