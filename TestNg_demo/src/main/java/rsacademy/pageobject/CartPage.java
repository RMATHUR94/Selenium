package rsacademy.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import rsacademy.AbstractComponents.AbstractComponents;

public class CartPage extends AbstractComponents
{
	@FindBy(css=".cartSection h3")
    List<WebElement>  cartProducts;
	
	//  WebElement  checkout = driver.findElement(By.cssSelector(".totalRow button"));
	@FindBy(css=".totalRow button")
    WebElement  checkoutEle;
    
    WebDriver driver;
	public CartPage(WebDriver driver) {
		super(driver);
		this.driver =driver;
		// TODO Auto-generated constructor stub
	}
	
	public Boolean VerifyProductDisplay(String prodTwo)
	{
		Boolean match = cartProducts.stream().anyMatch(cartProduct->cartProduct.getText().equalsIgnoreCase(prodTwo)); 
		return match;
	}
	
	public checkoutPage goTocheckout()
	{
		checkoutEle.click();
		
		return new checkoutPage(driver);
	}

}

//List <WebElement> cartProducts = driver.findElements(By.cssSelector(".cartSection h3"));
//
//Boolean match = cartProducts.stream().anyMatch(cartProduct->cartProduct.getText().equalsIgnoreCase(prodTwo));
////System.out.println(match);
//Assert.assertTrue(match);