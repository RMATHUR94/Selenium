package section15LatestFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class class123 {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","/home/vyrazu-66/Downloads/chromedriver_linux64 (2)/chromedriver");

        WebDriver driver=new ChromeDriver();	
       driver.get("https://rahulshettyacademy.com/angularpractice/");
       driver.manage().window().maximize();
       
     WebElement nameEditBox =  driver.findElement(By.cssSelector("[name='email']"));
     System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
        
    WebElement dob = driver.findElement(By.cssSelector("[for='dateofBirth']"));
    driver.findElement(with(By.tagName("input")).below(dob)).click();
    
    WebElement icec = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
    driver.findElement(with(By.tagName("input")).toLeftOf(icec)).click();
    
    //what is the text of after radio button lebel.
    WebElement rb = driver.findElement(By.id("inlineRadio1"));
    System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rb)).getText());
	}

}
