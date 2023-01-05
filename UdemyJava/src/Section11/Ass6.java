package Section11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ass6 {

	public static void main(String[] args) 
	{
		//a. select any checkbox.
		//b. select that check box option into the dropdown. here option should come from steps 1 .
		//c. enter step 2 grabbed lebel text into alert textbox.
		//5. click alert and then verify if text present in step 2 is present in the pop-up msg.
		// DO NOT HARDCODE THE LABEL PART // 
		System.setProperty("webdriver.chrome.driver","/home/vyrazu-66/Downloads/chromedriver_linux64 (1)/chromedriver");
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
        String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
        
        WebElement dropdwn = driver.findElement(By.id("dropdown-class-example"));
        Select s = new Select(dropdwn);
        s.selectByVisibleText(opt);
        
        driver.findElement(By.name("enter-name")).sendKeys(opt);
        driver.findElement(By.id("alertbtn")).click();
        
        System.out.println(driver.switchTo().alert().getText());
        String text = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        
        if(text.contains(opt))
        {
        	System.out.println("Success");
        }
        else
        {
        	System.out.println("FAIL");
        }
        
        
        
        
	}

}
