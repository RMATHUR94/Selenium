package rsacademy.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rsacademy.AbstractComponents.AbstractComponents;

public class ProductCatalogue extends AbstractComponents 
{
     WebDriver driver ;
     
    public  ProductCatalogue(WebDriver driver)
    {
    	 super(driver);
    	//initialization
    	this.driver =driver;
    	PageFactory.initElements(driver, this);
    }
    
	  
   // List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
    @FindBy(css=".mb-3")
    List<WebElement>  products;
    
//    wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
    @FindBy(css=".ng-animating")
    WebElement  spinner;
    
     By productBy = By.cssSelector(".mb-3");
     
     By addTocart = By.cssSelector(".card-body button:last-of-type");
     
     By toastMessage = By.cssSelector("#toast-container");
    
           
     public List<WebElement> getPoductsList()
     {
    	 waitForthElementToAppear(productBy);
    	 return products;
     }
    
     public WebElement getProductByName(String prodOne)
     {
    	WebElement prod = getPoductsList().stream().filter(product-> product.findElement(By.cssSelector("b")).getText().equals(prodOne)).findAny().orElse(null);
    	return prod;
     }
     
     public void addTocart(String prodOne)
     {
    	 WebElement prod = getProductByName(prodOne);
    	 prod.findElement(addTocart).click(); 
    	 waitForthElementToAppear(toastMessage);
    	 waitForthElementToDisappear(spinner);
     }
}
