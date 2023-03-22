package rsacademy.AbstractComponents;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponents 
{
	WebDriver driver;
    public AbstractComponents(WebDriver driver) //from childclass you are refering parent by super thats why constructor is created.
    {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
     
    @FindBy(css="[routerlink*='cart']")
    WebElement cartHeader;
    
	public void waitForthElementToAppear(By findby)
    {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

 	    wait.until(ExpectedConditions.visibilityOfElementLocated(findby));
    }
	
	public void waitForthElementToDisappear(WebElement ele) 
	{
		  // 4 sec slow_application issue.
	
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		  wait.until(ExpectedConditions.invisibilityOf(ele));
	}
	  
	public void goToCart()
	{
		cartHeader.click();
	}

	
	
}
