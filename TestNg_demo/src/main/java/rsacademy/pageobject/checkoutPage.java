package rsacademy.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rsacademy.AbstractComponents.AbstractComponents;

public class checkoutPage extends AbstractComponents
{
	
   WebDriver driver;
	public checkoutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	 @FindBy(css="[placeholder='Select Country']")
	    WebElement country;
	 
	 @FindBy(css=".btnn")
	    WebElement submit;
	 
	  @FindBy(xpath="(//button[contains(@class,'ta-item')])[2]")
	    WebElement selectIndia;
	  
	  By results = By.cssSelector(".ta-results");
	  
	  public void selectCountry(String countryName)
	  {
		  Actions a = new Actions(driver);
		  
		  a.sendKeys(country,countryName).build().perform();
		  
		  waitForthElementToAppear(By.cssSelector(".ta-results"));
		  
		  selectIndia.click();
	  }
	  
	  public ConfirmationPage submitOrder()
	  {
		  submit.click();
		 return new ConfirmationPage(driver);
	  }
}
//Actions a = new Actions(driver);
//a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")), "india").build().perform();
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
//driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();
//driver.findElement(By.cssSelector(".btnn")).click(); //another locator for placeorder = .action__submit






