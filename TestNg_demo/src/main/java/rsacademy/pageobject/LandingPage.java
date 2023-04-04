package rsacademy.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rsacademy.AbstractComponents.AbstractComponents;

public class LandingPage extends AbstractComponents
{
     WebDriver driver ;
     
    public  LandingPage(WebDriver driver)
    {
    	super(driver);
    	//initialization
    	this.driver =driver;
    	
    }
  
   //driver.findElement(By.id("userEmail")).sendKeys("rahul.mathur@vyrazu.com");
    @FindBy(id="userEmail")
    WebElement userEmail;
    // driver.findElement(By.id("userPassword")).sendKeys("R@hul456");
    @FindBy(id="userPassword")
    WebElement passwordforlogin;
    //driver.findElement(By.id("login")).click();
    @FindBy(id="login")
    WebElement submit;
           
    public void loginApplication(String email,String password)
    {
    	userEmail.sendKeys(email);
    	passwordforlogin.sendKeys(password);
    	submit.click();
    }
    public void goTo()
    {
    	 driver.get("https://rahulshettyacademy.com/client/");
    }
    
}
