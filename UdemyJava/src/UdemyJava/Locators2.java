package UdemyJava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws Exception
	{

		   System.setProperty("webdriver.chrome.driver","/home/vyrazu-66/Downloads/chromedriver_linux64 (1)/chromedriver");
		   WebDriver driver = new ChromeDriver();
		   
		   String pass = getPassword(driver);
		   
		   String name = "Rahul";
		   
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   
		   driver.get("https://rahulshettyacademy.com/locatorspractice/");
		   
		   driver.findElement(By.id("inputUsername")).sendKeys(name);
		   
		   driver.findElement(By.name("inputPassword")).sendKeys(pass);
		   
		   driver.findElement(By.className("signInBtn")).click();
		   
		   Thread.sleep(2000);
		   
           System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());        		   
           
		   Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		   
           driver.findElement(By.xpath("//*[text()='Log Out']")).click();
           
           //driver.close();
	}

	public static String getPassword(WebDriver driver) throws Exception
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-container']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		
	    String [] passwordArray = passwordText.split("'");
	    
	    String [] passwordArray2 = passwordArray[1].split("'"); 
	    
	    String password = passwordArray2[0];
	    
	    return password;
	}
}
