package com.test.project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstOne {

	public static void main(String[] args)
	{
	   
	   WebDriverManager.chromiumdriver().setup();
	   ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeOptions);
	   //WebDriver driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://rahulshettyacademy.com/client/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   driver.findElement(By.id("userEmail")).sendKeys("rahul.mathur@vyrazu.com");
	   driver.findElement(By.id("userPassword")).sendKeys("R@hul456");
	   driver.findElement(By.id("login")).click();
	   
	   List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
	   
	  WebElement prod = products.stream().filter(product-> product.findElement(By.cssSelector("b")).getText().equals("zara coat 3")).findAny().orElse(null);
	  
	  System.out.println(prod);
	   
	   

	}

}
