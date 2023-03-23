package rsacademy.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import rsacademy.AbstractComponents.AbstractComponents;

public class ConfirmationPage extends AbstractComponents {
	
	 @FindBy(css=".hero-primary")
	    WebElement confirmationMessage;
	 
	 @FindBy(css="[placeholder='.action__submit']")
	    WebElement submit;

	WebDriver driver;
	public   ConfirmationPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
		
		public String getConfirmationMessage()
		{
			return confirmationMessage.getText();
		}
		
		

}
//
////   String text=driver.findElement(By.cssSelector(".hero-primary")).getText();
//
//System.out.println(text);
//
//Assert.assertEquals(text, "THANKYOU FOR THE ORDER.");
//driver.close();