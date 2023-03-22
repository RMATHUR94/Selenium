package com.test.project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.util.internal.SystemPropertyUtil;

public class FirstOne2 {

	public static void main(String[] args) 
	{
	
	    WebDriverManager.chromiumdriver().setup();
	    ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeOptions);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://rahulshettyacademy.com/client/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   driver.findElement(By.id("userEmail")).sendKeys("rahul.mathur@vyrazu.com");
	   driver.findElement(By.id("userPassword")).sendKeys("R@hul456");
	   driver.findElement(By.id("login")).click();
//	   String prodOne = "ZARA COAT 3";
	   String prodTwo = "IPHONE 13 PRO";
	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
	  
	   List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
      //for selection of ZARA COART	   
	  WebElement prod = products.stream().filter(product-> product.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findAny().orElse(null);
	  prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
	  
	//wait until toast container
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
	 
	  //ng-animating
	  wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
     
	  //FOR SELECTION OF IPHONE
	  WebElement prod2 = products.stream().filter(product-> product.findElement(By.cssSelector("b")).getText().equals(prodTwo)).findAny().orElse(null);
	  
	  prod2.findElement(By.cssSelector(".card-body button:last-of-type")).click();  
	  //wait until toast container
	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
	  
	  //ng-animating
	  wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating")))); 
	  
      wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[routerlink*='cart']")));

      JavascriptExecutor js = (JavascriptExecutor) driver;
	  WebElement element = driver.findElement(By.cssSelector("[routerlink*='cart']"));
      js.executeScript("arguments[0].click()", element);
       
      List <WebElement> cartProducts = driver.findElements(By.cssSelector(".cartSection h3"));
      
      Boolean match = cartProducts.stream().anyMatch(cartProduct->cartProduct.getText().equalsIgnoreCase(prodTwo));
      System.out.println(match);
      Assert.assertTrue(match);
     //clicking check out using javascript executor.
      WebElement  checkout = driver.findElement(By.cssSelector(".totalRow button"));

      JavascriptExecutor js1 = (JavascriptExecutor) driver;

      js.executeScript("arguments[0].click();", checkout);
      
      Actions a = new Actions(driver);
      a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")), "india").build().perform();
  
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));

      driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();

      driver.findElement(By.cssSelector(".btnn")).click();
      
      String text=driver.findElement(By.cssSelector(".hero-primary")).getText();

      System.out.println(text);

      Assert.assertEquals(text, "THANKYOU FOR THE ORDER.");
      driver.close();



	   
	   

	}

}
