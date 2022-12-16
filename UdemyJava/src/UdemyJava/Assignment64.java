package UdemyJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment64 {

	public static void main(String[] args) 
	{

	    System.setProperty("webdriver.chrome.driver","/home/vyrazu-66/Downloads/chromedriver_linux64 (1)/chromedriver");
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();
        
        driver.findElement(By.name("name")).sendKeys("rahul");

        driver.findElement(By.name("email")).sendKeys("hello@abc.com");

        driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");
        
        driver.findElement(By.id("exampleCheck1")).click();
        
        WebElement dropdown =driver.findElement(By.id("exampleFormControlSelect1")); 
        
        Select sel = new Select(dropdown);
        
        sel.selectByVisibleText("Female");
        
        driver.findElement(By.id("inlineRadio2")).click();
        
        driver.findElement(By.name("bday")).sendKeys("05/08/1994");
        
        driver.findElement(By.cssSelector(".btn.btn-success")).click();
        
        System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
	}

}
